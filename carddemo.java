                                                                    Implementing CardLayout in Java Applet

 Aim :
      To write a Java program to demonstrate the use of CardLayout to display different buttons one at a time in an applet.     
 ALGORITHM:
 Start the program.
Import the required packages: java.io.*, java.awt.*, java.applet.*, and java.awt.event.*.
Create a class named carddemo that extends Applet and implements ActionListener.
Declare the required buttons, panel, and CardLayout objects.
Override the init() method.
Create a panel and add it to the applet.
Create a CardLayout object and set it as the layout manager of the panel.
Create three buttons: First Button, Second Button, and Third Button.
Register an action listener for each button and add the buttons to the panel with unique names.
Override the actionPerformed() method.
Use buttonCardLayout.next(buttonPanel) to display the next button whenever a button is clicked.
Execute the applet and observe the buttons appearing one at a time.
Stop the program.      

PROGRAM:    
import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="carddemo" width=250 height=150></applet>*/

public class carddemo extends Applet implements ActionListener {
    Button b1, b2, b3, b4;
    Panel buttonPanel;
    CardLayout buttonCardLayout;

    public void init() {
        buttonPanel = new Panel();
        add(buttonPanel);

        buttonCardLayout = new CardLayout();
        buttonPanel.setLayout(buttonCardLayout);

        b1 = new Button("first Button");
        b1.addActionListener(this);
        buttonPanel.add(b1, "first Button");

        b2 = new Button("second Button");
        b2.addActionListener(this);
        buttonPanel.add(b2, "second Button");

        b3 = new Button("third button");
        b3.addActionListener(this);
        buttonPanel.add(b3, "third Button");
    }

    public void actionPerformed(ActionEvent e) {
        buttonCardLayout.next(buttonPanel);
    }
}

RESULT:
       Thus, the Java applet program was written to demonstrate the CardLayout layout manager. When a button is clicked, the next button is displayed, showing how CardLayout displays one component at a time.
