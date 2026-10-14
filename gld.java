                                                          Implementation of GridLayout in Java
AIM:
     To create a Java applet using GridLayout to display ten buttons arranged in 5 rows and 2 columns.
    
ALGORITHM:
Start the program.
Create a class gld that extends the Applet class.
Set the layout to GridLayout(5,2).
Create ten buttons labeled A to J.
Add all ten buttons to the applet.
Set the inset spacing to 20 pixels on all sides.
Display the appLet.
Stop the program.

PROGRAM:    
import java.awt.*;
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;

/*<applet code="gld.class" height=300 width=300></applet>*/

public class gld extends Applet {
    public void init() {
        setLayout(new GridLayout(5,2));

        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");
        Button b5 = new Button("E");
        Button b6 = new Button("F");
        Button b7 = new Button("G");
        Button b8 = new Button("H");
        Button b9 = new Button("I");
        Button b10 = new Button("J");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
    }

    public Insets getInsets() {
        return new Insets(20,20,20,20);
    }
}

RESULT:
        Thus, the Java applet program using GridLayout was implemented successfully to display ten buttons in 5 rows and 2 columns.
