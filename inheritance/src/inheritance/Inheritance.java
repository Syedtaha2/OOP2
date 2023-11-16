/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Syed Taha
 */
class Vehicle{
    double speed;
    void go(){
        System.out.println("Vehicle is moving");
    }
    void stop(){
        System.out.println("Vehicle is stopped");
    }
}
class Car extends Vehicle{
    int wheels=4;
    int doors=4;
}
class Bicycle extends Vehicle{
    int wheels=2;
    int paddles=2;
}
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car c1 = new Car();
      //  c1.go();
        Bicycle b1= new Bicycle();
      //  b1.stop();
        System.out.println(c1.doors);
        System.out.println(b1.paddles);
        
    }
}
