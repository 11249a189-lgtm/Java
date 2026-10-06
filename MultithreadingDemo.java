                                                                            MULTITHREADING USING THREAD CLASS
 AIM:
      To write a Java program to demonstrate multithreading using the Thread class and sleep() method
 ALGORITYHM:
Start the program.
Create a class MyThread by extending the Thread class.
Override the run() method.
Print numbers from 1 to 5 inside the run() method.
Use sleep() to pause the thread for 500 milliseconds.
Create two thread objects, t1 and t2.
Start both threads using start().
Stop the program.

PROGRAM:
class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultithreadingDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}

OUTPUT:
Thread is running: 1
Thread is running: 1
Thread is running: 2
Thread is running: 2
Thread is running: 3
Thread is running: 3
Thread is running: 4
Thread is running: 4
Thread is running: 5
Thread is running: 5

RESULT:
        Thus, the Java program to demonstrate multithreading using the Thread class was successfully executed.
