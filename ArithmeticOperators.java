                                        Program to Perform Arithmetic Operations Using Java

AIM :
       To write a Java program to perform basic arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a menu-driven program.
ALGORITHM :

Start the program.
Import the Scanner class to get input from the user.
Create a Scanner object.
Read the first number x.
Read the second number y.
Display the menu of arithmetic operations:
Addition
Subtraction
Multiplication
Division
Modulus
Exit
Read the user's choice.
Use a switch statement to perform the selected operation.
For division and modulus, check whether the second number is zero.
Display the result.
If the user selects Exit, terminate the program.
For an invalid choice, display an error message.
Repeat the process until the user chooses Exit.
Stop the program.

PROGRAM :    
import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Enter the two numbers to perform operations");
            System.out.print("Enter the first number : ");
            int x = s.nextInt();
            System.out.print("Enter the second number : ");
            int y = s.nextInt();
            System.out.println("Choose the operation you want to perform");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    int add = x + y;
                    System.out.println("Result : " + add);
                    break;
                case 2:
                    int sub = x - y;
                    System.out.println("Result : " + sub);
                    break;
                case 3:
                    int mul = x * y;
                    System.out.println("Result : " + mul);
                    break;
                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result : " + div);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    if (y != 0) {
                        int mod = x % y;
                        System.out.println("Result : " + mod);
                    } else {
                        System.out.println("Modulus by zero is not allowed.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    s.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

OUTPUT :
Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 5
Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT
1
Result : 25

Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 5
Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT
2
Result : 15

Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 5
Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT
3
Result : 100

Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 5
Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT
4
Result : 4.0

Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 5
Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT
5
Result : 0

Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 5
Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT
6
Exiting...

RESULT :
         Thus, the Java program was successfully executed to perform addition, subtraction, multiplication, division, and modulus operations using a menu-driven approach.
