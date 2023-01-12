class myThread extends Thread {
    myThread(String name) {
        super(name); // Thread class have own constructor that Set its name thats why used Super() to
                     // send name.
    }

    public void run() {
        System.out.println("Thank you");
        int i = 0;
        while(i<100){
            System.out.println("Thank you: " + this.getName());
            i++;
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        myThread t1 = new myThread("First One");
        myThread t2 = new myThread("Second One");
        myThread t3 = new myThread("Third One");
        myThread t4 = new myThread("Fourth One Who is the Important");
        myThread t5 = new myThread("Fifth One");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();  //--------> Thread method for start the function.
        t2.start();
        t3.start(); 
        t4.start();
        t5.start();
        System.out.println("The id of the thread t is " + t1.getId());  // t1.getId() ---> By this get the Id Of this thread.... this is a method of Thread class
        System.out.println("The name of the thread t is " + t1.getName()); // t1.getName() ---> By this get the name of this thread.... this is also method of Thread class
//  This Are pre-define method ... for More information about this method, go --> Thread methods Of Oracle Documentation
// OTHER METHODS OF THIS CLASS 
// Thread ( Runnable r )  ----> Use in Case of use interface
// Thread ( Runnable r, String name ) 
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());

    }
}
