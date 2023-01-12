/*[[[[[[[[[[[[[[[[[ FOR DELAY ONES/ OTHERS EXECUTION]]]]]]]]]]]]]]]]]
1. Join() Method------------
.Join() method puts the current thread on wait until the thread on which it is called is dead.
You can also specify the time for which you need to wait for the execution of a particular thread by using the Join() method. Syntax

Syntax : public final void join()
>>>>>>>> public final void join(long milliseconds)

2. Sleep() Method------------
    The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
    When we put a thread to sleep, the thread scheduler picks and executes another thread in the queue.
    Sleep() method returns void.
    sleep() method can be used for any thread, including the main() thread also.

Syntax :
    public static void sleep(long milliseconds)throws InterruptedException
    public static void sleep(long milliseconds, int nanos)throws InterruptedException

 */

 class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            // try {
            //     Thread.sleep(455);  // By this Execution Will delay of this method....for this case the print will be late for some time
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
            System.out.println("I am a thread1");
            i++;
        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
        int i =0;
        while(i<100){
            // try {
            //     Thread.sleep(200);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
            System.out.println("My Thank you: ");
            i++;
        }
    }
}

public class Thread_methods2 {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try{
            t1.join(); // if use this then at first execute the run method of t1 after complete the execution of t1 then Execution of t2 will start...........
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();

    }
}
