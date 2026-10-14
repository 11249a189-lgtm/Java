                                                   Implementation of BorderLayout in Java
AIM:
     To create a Java applet using BorderLayout to arrange buttons and a text area in five regions.

ALGORITHM:
Start the program.
Create a class insertdemo that extends the Applet class.
Set the background color to cyan.
Set the layout to BorderLayout.
Add a button at the NORTH region.
Add a button at the SOUTH region.
Add buttons at the EAST and WEST regions.
Add a text area at the CENTER region.
Set the inset spacing to 10 pixels on all sides.
Display the applet.
Stop the program.   

PROGRAM:    
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;

/*<applet code="insertdemo" width=400 height=200></applet>*/

public class insertdemo extends Applet {
    public void init() {
        setBackground(Color.cyan);
        setLayout(new BorderLayout());

        add(new Button("this is cross the top"), BorderLayout.NORTH);
        add(new Button("the footer messsage might go here"), BorderLayout.SOUTH);
        add(new Button("RIGHT"), BorderLayout.EAST);
        add(new Button("LEFT"), BorderLayout.WEST);

        String msg = "the reasonable man adapts\n\n";
        add(new TextArea(msg), BorderLayout.CENTER);
    }

    public Insets getInsets() {
        return new Insets(10, 10, 10, 10);
    }
}

RESULT:
        Thus, the Java applet program using BorderLayout was implemented successfully to arrange buttons and a text area in the five regions: North, South, East, West, and Center.
