                                                                   LARGEST, SMALLEST AND SUM OF ARRAY ELEMENTS IN JAVA
AIM:
     To write a Java program to find the sum, largest, and smallest elements in an array.
ALGORITHM:
Start the program.
Create an array with 10 numbers.
Initialize sum, min, and max.
Traverse through all the elements of the array.
Add each element to sum.
Compare each element with max and update the largest value.
Compare each element with min and update the smallest value.
Display the sum, largest, and smallest numbers.
Stop the program.

 PROGRAM:   
public class LargestSmallest {
    public static void main(String[] args) {

        int[] a = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is : " + sum);
        System.out.println("Largest Number in the given array is : " + max);
        System.out.println("Smallest Number in the given array is : " + min);
    }
}

OUTPUT:
The sum is : 357
Largest Number in the given array is : 90
Smallest Number in the given array is : 9

RESULT:
       Thus, the Java program to find the sum, largest, and smallest elements of an array was successfully executed.
