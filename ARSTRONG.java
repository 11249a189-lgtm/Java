                                                                      ARMSTRONG NUMBER PROGRAM
AIM:
     To write a Java program to check whether a given number is an Armstrong number or not.
Algorithm:
Start the program.
Read a number n from the user.
Store the original number in original.
Count the number of digits in n.
Extract each digit of the number.
Raise each digit to the power of the total number of digits and add the results.
Compare the calculated sum with the original number.
If both are equal, display “Armstrong number”.
Otherwise, display “Not an Armstrong number”.
Stop the program. 
    
Program:
import java.util.Scanner;

public class ARSTRONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, original, digit, digits = 0, sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        original = n;

        // Count the number of digits
        int temp = n;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Calculate Armstrong sum
        temp = n;
        while (temp != 0) {
            digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");

        sc.close();
    }
}
OUTPUT :
  Enter a number: 153
  153 is an Armstrong number.
RESULT :
    Thus, the Java program to check whether the given number is an Armstrong number or not was successfully executed and verified.
    
