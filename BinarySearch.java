                                                                               BINARY SEARCH IN JAVA
AIM:
     To write a Java program to search for an element in a sorted array using Binary Search.
ALGORITHM:
Start the program.
Read the number of elements.
Enter the elements in ascending order.
Read the element to be searched.
Set low = 0 and high = n - 1.
Find the middle element.
If the middle element is equal to the search element, display its position.
If the middle element is smaller, search the right half.
Otherwise, search the left half.
Repeat until the element is found or the search range becomes empty.
If the element is not found, display Element not found.
Stop the program.

 PROGRAM:   
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        int low = 0, high = n - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}

OUTPUT:
Enter the number of elements: 5
Enter the elements in ascending order:
10 20 30 40 50
Enter the element to search: 30
Element found at position: 3

RESULT:
        Thus, the Java program to search an element using Binary Search was successfully executed.
