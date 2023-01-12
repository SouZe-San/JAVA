/**
 * Thread_in_java
 * 
 * Normally in java all function run One by one at first main, After complete
 * then next fun1 after Complete All method then next fun2 run like this...
 * But when use thread all function work or run parallel Without Completing Ones
 * All methods Other Class Or Function start run ..... for this it COnsume more
 * time
 * 
 * Ways To Create A Thread In Java ------------
 * By extending the thread class 
 * By implementing a Runnable interface 
 * 
 * 
 * In thread Class There HAve some Pre-define method like " run() / start() "
 */

// [[[[[[[[[[[[[[[[[[[[[[ 1. ONE WAY TO CREATE THREAD - extending the thread
// class ]]]]]]]]]]]]]]]]]]]]]]

class MyThread1 extends Thread {
    
    /** 
     * @param 4000
     */
    @Override
    public void run() {   // This rub Method present in Thread class that why have to Override this method
        int i = 0;
        while (i < 4000) {
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

// [[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[ 2. ANOTHER WAY TO CREATE THREAD
// -implementing a Runnable interface ]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
class MyThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am THREAD no 1");
            System.out.println("I am seeing!");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am a thread no 2");
            System.out.println("I am smelling!");
            i++;
        }
    }
}

public class Thread_in_java {
    public static void main(String[] args) {

        // ?<<><<<< Way to declare a thread which creating By extends thread class
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

        // ><><?<?<<?<?<< when creating threads by implements Interfaces
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);  // -----> Crate a thread object and pass the runnable obj.


        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }

}

/*
 * OUTPUT be Like this:
 * With out Finishing the run Of t1 , T2 start run then Again T1 start run
 * 
 * My Cooking Thread is Running
 * I am happy!
 * My Cooking Thread is Running
 * I am happy!
 * My Cooking Thread is Running
 * I am happy!
 * My Cooking Thread is Running
 * I am happy!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 * My Cooking Thread is Running
 * I am happy!
 * My Cooking Thread is Running
 * I am happy!
 * My Cooking Thread is Running
 * I am happy!
 * My Cooking Thread is Running
 * I am happy!
 * My Cooking Thread is Running
 * I am happy!
 * My Cooking Thread is Running
 * I am happy!
 * Thread 2 for Chatting with her
 * I am sad!
 * Thread 2 for Chatting with her
 * I am sad!
 */