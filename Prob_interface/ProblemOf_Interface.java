
/*
    Create an abstract class pen with methods write () and refill () as abstract methods 
    Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
    Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and implements basicAnimal interface with eat ( ) and sleep methods 
    Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism 
    Demonstrate polymorphism using using monkey  class from Q3 
    Create an interface TVremote and use it to inherit another interface smart TVremote 
    Create a class TV which implements TVremote interface from Q6

 */

abstract class telephone implements TVremote {
    abstract void with();

    abstract void lift();

    abstract void disconnect();
}

/**
 * GPS
 */
interface GPS {
    default void location(){
        System.out.println("Your Location is @*&&^$*");
    }
    void tracker();
}

interface TVremote{
    default void  volumeIncrease(int a){
        System.out.println("Volume Increased by " + a);
    }
    void volumeDecrease();

}
/**
 * smartTvremote
 */
interface smartTvRemote extends TVremote{
    void chanel();
    void back();
}
/**
 * smartTelephone
 */
class smartTelephone extends telephone implements GPS,smartTvRemote{
    public void with() {
        System.out.println("you are now connected..");
    }
    void videoCall(){
        System.out.println("Your are now in Video Call.......");
    }
    public void lift() {
        System.out.println("pick Up the call ... In An another call");
    }

    public void disconnect() {
        System.out.println("CAll disconnected...");
    }

    public void tracker() {
        System.out.println("your Location Is Tracked");
    }
    public void volumeDecrease(){
        System.out.println( " The volume  decreased by 1");
         }
        public void chanel(){
            System.out.println("channel Changed");
        }
        public void back(){
            System.out.println("You Returned previous channel");
        }
   

}


public class ProblemOf_Interface {
public static void main(String[] args) {
    smartTelephone smte = new smartTelephone();
    smte.videoCall();
    smte.disconnect();
    smte.location();
    smte.back();
    smte.volumeIncrease(5);
    telephone te = new smartTelephone();
    te.with();
    te.lift();
    te.volumeDecrease();
}
}
