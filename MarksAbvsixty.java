                                                                          STUDENT MARKS ABOVE 60 IN JAVA
AIM:
     To write a Java program to read the names and marks of 6 students and display the students who scored 60 or above.
ALGORITHM:
Start the program.
Create arrays to store names and marks of 6 students.
Read the name and marks of each student.
Check each student's marks.
If the marks are 60 or above, display the student's name and marks.
Stop the program.

 PROGRAM:   
import java.util.Scanner;
public class MarksAbvsixty {
    public static void main(String[] args) {
        int[] marks = new int[6];
        String[] name = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }
        System.out.println("\nStudents who scored 60 or above:");
        for (int i = 0; i < 6; i++) {
            if (marks[i] >= 60) {
                System.out.println(name[i] + " " + marks[i]);
            }
        }
        scanner.close();
    }
}

OUTPUT:
Enter Name of Student and Marks of Subject 1: Ravi 75
Enter Name of Student and Marks of Subject 2: Priya 55
Enter Name of Student and Marks of Subject 3: Arun 68
Enter Name of Student and Marks of Subject 4: Divya 45
Enter Name of Student and Marks of Subject 5: Kiran 82
Enter Name of Student and Marks of Subject 6: Anu 60

Students who scored 60 or above:
Ravi 75
Arun 68
Kiran 82
Anu 60

 RESULT:
        Thus, the Java program to display students who scored 60 or above was successfully executed.
