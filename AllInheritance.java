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
