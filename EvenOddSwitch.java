                                                                             CHECK EVEN OR ODD USING SWITCH IN JAVA
AIM:
     To write a Java program to check whether a given number is even or odd using a switch statement.
ALGORITHM:
Start the program.
Read a number from the user.
Find the remainder when the number is divided by 2.
Use a switch statement to check the remainder.
If the remainder is 0, display Even.
If the remainder is 1 or -1, display Odd.
Stop the program.

PROGRAM:    
import java.util.Scanner;
class EvenOddSwitch {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println("This number is even");
                break;
            case 1:
            case -1:
                System.out.println("This number is odd");
                break;
            default:
                System.out.println("Invalid input");
        }
        s.close();
    }
}

OUTPUT:
Enter a number: 25
This number is odd

RESULT:
       Thus, the Java program to check whether a given number is even or odd using a switch statement was successfully executed.
