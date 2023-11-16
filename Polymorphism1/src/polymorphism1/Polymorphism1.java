/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism1;

/**
 *
 * @author Syed Taha
 */
class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
         System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+ age);
    }
}
public class Polymorphism1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Taha";
        s.age=20;
        s.printInfo(s.name, s.age);
    }
}
