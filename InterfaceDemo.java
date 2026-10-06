                                                                                    INTERFACE IN JAVA 
AIM:
     To write a Java program to demonstrate the use of an interface using the implements keyword.
ALGORITHM:
Start the program.
Create an interface named Animal.
Declare the sound() method inside the interface.
Create a class Dog that implements the Animal interface.
Define the sound() method in the Dog class.
Create an object of the Dog class.
Call the sound() method.
Display the output.
Stop the program.

PROGRAM:    
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

OUTPUT:
       Dog barks

RESULT:
        Thus, the Java program to demonstrate the use of an interface was successfully executed.
