/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author Syed Taha
 */
abstract class Animal{
   abstract void walk();
   Animal(){
       System.out.println("Creating new animal");
   }
   public void eat(){
       System.out.println("Animal eats");
   }
}
class Horse extends Animal{
    Horse(){
        System.out.println("creating a new horse");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}
public class Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
       Chicken c= new Chicken();
       //c.walk();
      // h.eat();
            
        
    }
}
