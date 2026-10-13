                                                              Drawing Basic Shapes Using Java Applet

AIM :
      To write a Java program using the Graphics class to draw lines, rectangles, filled rectangles, rounded rectangles, filled rounded rectangles, and intersecting lines using an applet.
    
Algorithm:
Start the program.
Import the java.awt.*, java.io.*, and java.applet.* packages.
Create a class named Draw that extends the Applet class.
Override the paint(Graphics g) method.
Use drawLine() to draw straight lines.
Use drawRect() to draw a rectangle.
Use fillRect() to draw a filled rectangle.
Use drawRoundRect() to draw a rounded rectangle.
Use fillRoundRect() to draw a filled rounded rectangle.
Draw two intersecting lines using drawLine().
Execute the applet to display the shapes.
Stop the program.

PROGRAM :    
import java.awt.*;
import java.io.*;
import java.applet.*;

/* <applet code="Draw.class" height=300 width=300>
</applet> */

public class Draw extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(10, 50, 50, 50);
        g.drawRect(10, 60, 40, 30);
        g.fillRect(60, 10, 30, 80);
        g.drawRoundRect(10, 100, 80, 50, 10, 10);
        g.fillRoundRect(20, 110, 60, 30, 5, 5);
        g.drawLine(100, 10, 230, 140);
        g.drawLine(100, 140, 230, 10);
    }
}

RESULT:
        Thus, the Java applet program was written and executed to display straight lines, a rectangle, a filled rectangle, rounded rectangles, and two intersecting lines using the Graphics class.
