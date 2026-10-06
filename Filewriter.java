                                                                               FILE WRITING USING FILEWRITER IN JAVA
AIM:
     To write a Java program to create a file and write characters into it using the FileWriter class.
ALGORITHM:
Start the program.
Create a FileWriter object for sample2.txt.
Use a loop to generate characters from A to Z.
Write each character into the file.
Close the file using close().
Handle any exception using try-catch.
Stop the program.

PROGRAM:    
import java.io.*;

class Filewriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample2.txt");

            for (char i = 65; i < 91; i++) {
                fw.write(i);
            }

            fw.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

OUTPUT:
Contents of sample2.txt:

ABCDEFGHIJKLMNOPQRSTUVWXYZ

RESULT:
       Thus, the Java program to write characters from A to Z into a file using FileWriter was successfully executed.

