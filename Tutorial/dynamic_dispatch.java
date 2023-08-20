class Phone {
    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

// Its just mean we can use the Phone class as a reference class or should say
// like we all man or human sub-child indian,European like have divided by
// specific feature.
// thats why if tell a indian type variable and reference as man then it will
// work but can tell man as reference and variable is any specific child

class SmartPhone1 extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    @Override
    public void on() {
        System.out.println("Turning on SmartPhone...");
    }

    public void record4KVideo() {
    }
}

public class dynamic_dispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone1(); // Yes it is allowed --> in smartphone have methods of phone |||| mean
                                       // smartphone can Use as phone
        // SmartPhone obj2 = new Phone(); // Not allowed --> Can't Use phone As
        // Smartphone .. Phone don't have methods of smartphone

        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed

    }
}
