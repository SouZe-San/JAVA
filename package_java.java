// import soumyajit.shape.*;   // WithOut This can Run all program But don't know why
/*
*** WRITE THIS CODE IN NOTEPAD ***
 You have to create a package named name.shape
 This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
 Include methods like volume, surface area and getters/setters for dimensions

 BY CREATE PACKAGE can use other packages like soumyajit.shape.Rectangle, soumyajit.shape.sphere, soumyajit.shape.Cylinder, soumyajit.shape.*.
 so for Sphere ,cylinder don't have to Recreate those class ...... Instead Can Use My Own Crate class >>>
 */


public class package_java {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        cylinder cylinder1 = new cylinder(2.3f, 4.5f);
        sphere sp = new sphere();
        sp.setRadius(4);
        rectangle rectangle = new rectangle(6,5);        
        System.out.println(rectangle.getBreath());
        // rectangle.getClass();
        System.out.println("the height is: " + cylinder1.getHeight());
        System.out.println("the Radius is: " + cylinder1.getRadius());
        System.out.println("the Surface is: " + cylinder1.surface());
        System.out.println("the Volume is: " + cylinder1.volume());

    }
}
