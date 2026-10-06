                                                                                       FIBONACCI SERIES IN JAVA
AIM:
     To write a Java program to generate the Fibonacci series for a given number of terms.
ALGORITHM:
Start the program.
Read the number of terms n.
Initialize a = 0 and b = 1.
Repeat the following steps n times:
Display a.
Calculate c = a + b.
Set a = b and b = c.
Stop the program.

PROGRAM:    
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}

OUTPUT:
Enter the number of terms: 10
Fibonacci Series:
0 1 1 2 3 5 8 13 21 34

RESULT:
        Thus, the Java program to generate the Fibonacci series for the given number of terms was successfully executed.
