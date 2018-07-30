
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
   private String emp_name;
   private String emp_id;
   private double emp_salary;
   
   //default constructor
   public Employee()
   {
       emp_name = " ";
       emp_id = " ";
       emp_salary = 0;
   }
   
   //normal constructor
   public Employee(String emp_name, String emp_id, double emp_salary)
   {
       this.emp_name = emp_name;
       this.emp_id = emp_id;
       this.emp_salary = emp_salary;
   }
   
   //accessor or getter method
   public String getEname() { return emp_name;}
   public String getEid() {return emp_id;}
   public double getEsalary() {return emp_salary;}
   
   //mutator or setter method
   public void setEmployee(String emp_name, String emp_id, double emp_salary)
   {
       this.emp_name = emp_name;
       this.emp_id = emp_id;
       this.emp_salary = emp_salary;
   }
   
   public String toString()
   {
       return "Name: " + emp_name + "\nID: " + emp_id + "\nSalary :RM " + emp_salary;
   }
}
