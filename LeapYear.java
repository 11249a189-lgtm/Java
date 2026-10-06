                                                                                  LEAP YEAR CHECKING IN JAVA
AIM:
     To write a Java program to check whether a given year is a Leap Year or not.
ALGORITHM:
Start the program.
Read a year from the user.
Check if the year is divisible by 400.
If not, check if it is divisible by 100.
If not, check if it is divisible by 4.
If the condition is satisfied, display Leap Year.
Otherwise, display Not a Leap Year.
Stop the program.
    
PROGRAM:
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = s.nextInt();
        boolean flag = false;
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("Year " + year + " is a Leap Year");
        } else {
            System.out.println("Year " + year + " is not a Leap Year");
        }
        s.close();
    }
}

OUTPUT:
Enter any year: 2024
Year 2024 is a Leap Year

RESULT:
        Thus, the Java program to check whether the given year is a Leap Year or not was successfully executed.
