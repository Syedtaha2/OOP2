/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation2;

/**
 *
 * @author Syed Taha
 */
class Employee{
    private String name;
   private int ID;
   private int salary;

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
   
   
}
public class Encapsulation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setID(9);
        e.setName("Taha");
        e.setSalary(30000);
        System.out.println("Name:"+e.getName());
        System.out.println("ID:"+e.getID());
        System.out.println("Salary: "+e.getSalary());
    }
}
