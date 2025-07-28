import java.util.*;
public class arraylistworking {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=s.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }   
       arr=insertAtBeginning(arr, n);
       System.out.println("Array after insertion at beginning:");   
         for(int i = 0; i < n + 1; i++) {
                System.out.print(arr[i] + " ");
          }
          arr= insertAtEnd(arr, n + 1);
          System.out.println("\nArray after insertion at end:");        
            for(int i = 0; i < n + 2; i++) {
                    System.out.print(arr[i] + " ");
            }   
            arr=insertAtMiddle(arr, n + 2);
            System.out.println("\nArray after insertion at middle:");       
            for(int i = 0; i < n + 3; i++) {
                    System.out.print(arr[i] + " ");
            }
    }
    public static int[] insertAtBeginning(int[] arr, int n) {
        int[] newArr = new int[n + 1];
        int element=10;
        newArr[0] = element;
        for(int i = 0; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
    public static int[] insertAtEnd(int[] arr, int n) {
        int[] newArr = new int[n + 1];
        for(int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = element;
        return newArr;
    }
    public static int[] insertAtMiddle(int[] arr, int n) {
        int[] newArr = new int[n + 1];
        int mid = n / 2;
        for(int i = 0; i < mid; i++) {
            newArr[i] = arr[i];
        }
        newArr[mid] = element;
        for(int i = mid; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
    
}
