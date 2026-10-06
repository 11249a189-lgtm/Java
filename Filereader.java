                                                                      FILE READING USING FILEREADER IN JAVA
AIM:
     To write a Java program to read the contents of a file using the FileReader class.
ALGORITHM:
Start the program.
Create a FileReader object for sample2.txt.
Read the file character by character using read().
Display each character on the screen.
Continue reading until the end of the file is reached.
Close the file using close().
Handle any exception

 PROGRAM:   
import java.io.*;

class Filereader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample2.txt");
            int i;

            while ((i = fr.read()) != -1) {
                System.out.println((char) i);
            }

            fr.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

OUTPUT:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
 RESULT:
         Thus, the Java program to read and display the contents of a file using FileReader was successfully executed.
