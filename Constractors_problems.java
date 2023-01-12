// package soumyajit.shape; >>>>> This is for create the main package. 

//   ----------------- ALL PROBLEM SOLVED
/*
1. create a class cylinder and use getter and setters to set its radius and height 
2.use ➊ to calculate surface and volume of the cylinder 
3.Use a constructor and repeat ➊
4.Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters 
5.Repeat ➊ for a sphere   
 */

 /**
  * cylinder from Constructors_problems
  */
class cylinder {
   private float radius, height;

   cylinder(){
    this.height = 0;
    this.radius =0;
    System.out.println(" By default all set as 0");
   }
    
    /** 
     * @param height
     */
    // problem 1, Value get by Methods...
    public void setHeight(float height) {
        this.height = height;
    }
    
    /** 
     * @param radius
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    /** 
     * @return float
     */
    public float getRadius() {
        return radius;
    }
    
    /** 
     * @return float
     */
    public float getHeight() {
        return height;
    }   
    
    
    /** 
     * @return double
     */
    // problem 2.
    public double volume() {
         // V = πr2h
        return Math.PI*radius*radius*height;
    }
    
    /** 
     * @return double
     */
    public double surface() {
        //S = 2πr(h+r)
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }

    // problem 3. here just made a constarctor for get Radius and height--
    public cylinder(float r, float h){
        this.height = h;
        this.radius = r;
    }
 }

 /**
  * rectangle from Constructors_problems
  */
class rectangle {
 
    private int length;
    private int breath;

    // First constructor for set value by default ---
    rectangle(){
        this.breath = 5;
        this.length = 4;
        System.out.println("By default length is: 4 and breath set is : 5");
    }
    rectangle(int l, int b){
        this.breath = b;
        this.length = l;
        System.out.print("Set value as passes by parameter \n");
        System.out.println(" length is: "+ l +" and breath set is :" + b );
    }
    public int getBreath() {
        return breath;
    }
    public int getLength() {
        return length;
    }
 }

 /**
  * sphere  from Constructors_problems
  */
 class sphere {
    private float radius;
    sphere(){
        this.radius =0;
        System.out.println(" By default all set as 0");
       } 

        public void setRadius(float radius) {
            this.radius = radius;
        }

        public float getRadius() {
            return radius;
        }

        public double volume() {
             // V = 4/3πr3
            return (4/3)*Math.PI*radius*radius*radius;
        }
       
       
    
 }

public class Constractors_problems {
    public static void main(String[] args) {

        // cylender cylender= new cylender();
        // cylender.setHeight((4));
        // cylender.setRadius(3.4f);
        cylinder cylender1 = new cylinder(2.3f, 4.5f);
        

        System.out.println("the height is: " + cylender1.getHeight());
        System.out.println("the Radius is: " + cylender1.getRadius());
        System.out.println("the Surface is: " + cylender1.surface());
        System.out.println("the Volume is: " + cylender1.volume());
        
        
    }
}
