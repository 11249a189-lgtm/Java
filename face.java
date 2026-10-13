                                                               Drawing a Smiley Face Using Java Applet
AIM:
     To write a Java program using the Graphics class to draw a human face with eyes, pupils, a nose, ears, and a smiling mouth using different drawing methods.
ALGORITHM:
                                                                   Start the program.

Import the required packages: java.awt.*, java.io.*, and java.applet.*.
Create a class named face that extends the Applet class.
Override the paint(Graphics g) method.
Use drawOval() to draw the face, eyes, and ears.
Use fillOval() to draw the pupils and nose.
Use fillArc() to draw the smiling mouth.
Execute the applet to display the face.
Stop the program.

PROGRAM:    
import java.awt.*;
import java.io.*;
import java.applet.*;

/* <applet code = "face.class" height = 300 width = 300>
</applet> */

public class face extends Applet
{
    public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 73, 30, 20);
        g.drawOval(110, 75, 30, 20);
        g.fillOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);
        g.fillOval(85, 100, 30, 30);
        g.fillArc(60, 125, 80, 40, 180, 180);
        g.drawOval(25, 92, 15, 30);
        g.drawOval(85, 100, 30, 30);
    }
}

RESULT:
Thus, the Java applet program was written to draw a human face with eyes, pupils, a nose, ears, and a smiling mouth using the Graphics class.


