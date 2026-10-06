                                                                          LARGEST OF THREE NUMBERS IN JAVA
AIM:
     To write a Java program to find the largest of three integers using if-else statements.
ALGORITHM:
Start the program.
Read three integers x, y, and z.
Compare x with y and z.
If x is greater, display that the first number is largest.
Otherwise, compare y with x and z.
If y is greater, display that the second number is largest.
Otherwise, compare z with x and y.
If z is greater, display that the third number is largest.
If none is greater, display that the numbers are not distinct.
Stop the program.   

PROGRAM: 
import java.util.Scanner;
class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter three integers");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if (x > y && x > z) {
            System.out.println("First number is largest.");
        } else if (y > x && y > z) {
            System.out.println("Second number is largest.");
        } else if (z > x && z > y) {
            System.out.println("Third number is largest.");
        } else {
            System.out.println("The numbers are not distinct.");
        }
        in.close();
    }
}

OUTPUT:
Enter three integers
25
45
30
Second number is largest.

RESULT:
        Thus, the Java program to find the largest of three numbers was successfully executed.
    
