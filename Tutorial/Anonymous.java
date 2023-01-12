/*
   Java Anonymous Classes:: ==================
   Anonymous class is nothing but a class without any name.
   When we use interface and  we can Direct Override that method in MAIN method...
    Even In interface present only one Method still have to write method name and its code ..... But in Lambda Method No need that
   it increase the readability in the code

   Lambda Expressions : ===================== 
        // this can be used only when interface have only one abstract method ..........
        they are similar to previous here Don't need any name--
         AS their can present only one method that's why don't need to mention the name of method Only write the code of Execute
        CAn In one line easy and increase the ..
 */


interface Animal{
    void bark();
    void eat();
}

/*
 * DON'T DO THIS --------- Instead do what do in main method
class Dog implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
 */

 @FunctionalInterface
 interface LambsExp{
     int sumCalculate(int a, int b);
 }

public class Anonymous {
    public static void main(String[] args) {
        // Don't Do this --------------
        // Dog d = new Dog();
        // d.bark(); 

        // Instead That do this---------------------- Direct Explanation
        Animal ani =new  Animal(){
            @Override
            public void bark(){
                System.out.println("wow! WOw!");
            }
            @Override
            public void eat() {
                System.out.println("EAT meat");
            }
        };

        ani.bark();
        ani.eat();
        // We Don't Need to create class or don't need to write method Another and implement It CAN be done on One position and it EASY..

        // ----------------------- It Can Be Achieve by AN another Method And that is Lambda method  if the  @functionInterface used--------------------

        LambsExp lExp = (a, b) -> { // <name> an Object = In () pass Needed parameters -> { *CODE What execute }.........
              return a+b;
        };
        System.out.println(lExp.sumCalculate(5,3));
        
    }
}
