                                          Program to Demonstrate All Types of Inheritance in Java

AIM :
      To write a Java program to demonstrate different types of inheritance in Java, such as Single Inheritance, Multilevel Inheritance, Hierarchical Inheritance, and Multiple Inheritance using Interfaces.

ALGORITHM :
Start the program.
Create an Animal class with an eat() method.
Create a Dog class that extends Animal to demonstrate Single Inheritance.
Create a Puppy class that extends Dog to demonstrate Multilevel Inheritance.
Create a Cat class that extends Animal to demonstrate Hierarchical Inheritance.
Create Father and Mother interfaces with their respective methods.
Create a Child class that implements both interfaces to demonstrate Multiple Inheritance using Interfaces.
Create objects for Dog, Puppy, Cat, and Child.
Call the appropriate methods using each object.
Display the results.
Stop the program.

PROGRAM :    
// All types of inheritance in Java

// Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Interfaces for Multiple Inheritance
interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

// Multiple + Hybrid Inheritance
class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Child gets father's property");
    }

    public void motherProperty() {
        System.out.println("Child gets mother's property");
    }
}

public class AllInheritance {
    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        // Hierarchical Inheritance
        Cat c = new Cat();
        c.eat();
        c.meow();

        // Multiple Inheritance using Interfaces
        Child ch = new Child();
        ch.fatherProperty();
        ch.motherProperty();
    }
}

OUTPUT :
Animal eats
Dog barks
Animal eats
Dog barks
Puppy plays
Animal eats
Cat meows
Child gets father's property
Child gets mother's property

RESULT :
         Thus, the Java program was successfully executed to demonstrate Single, Multilevel, Hierarchical, and Multiple Inheritance using Interfaces.
