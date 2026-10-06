                                                                           SORTING ELEMENTS IN ASCENDING ORDER IN JAVA
AIM:
     To write a Java program to sort the elements of an array in ascending order.
ALGORITHM:
Start the program.
Read the number of elements.
Enter the elements into the array.
Compare each element with the remaining elements.
If the first element is greater, swap the two elements.
Repeat the process until all elements are sorted.
Display the elements in ascending order.
Stop the program.

PROGRAM:    
import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Sorting in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

OUTPUT:
Enter the number of elements: 5
Enter the elements:
50 20 40 10 30
Elements in ascending order:
10 20 30 40 50

RESULT:
        Thus, the Java program to sort the given array elements in ascending order was successfully executed.
