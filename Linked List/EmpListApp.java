
/**
 * Write a description of class EmpList here.
 * Fathiah Husna Binti Firdaus
 * CS2304A
 */
import java.util.*;
public class EmpListApp
{
    public static void main(String[] args)
    {
        MyLinkedList empList = new MyLinkedList();
        Scanner in = new Scanner (System.in);
        
        System.out.print("\nNumber of employees: ");
        int n = in.nextInt();
        
        System.out.print("\nInsert data for employee(s)");
        for (int i=0; i<n; i++)
        {
            System.out.print("\nName: ");
            String name = in.next();
            System.out.print("ID: ");
            String id = in.next();
            System.out.print("Salary: RM");
            double salary = in.nextDouble();
            
            Employee employee = new Employee(name, id, salary);
            empList.insertAtFront(employee); 
        }
        
        System.out.print("\nContent of employee(s)" + "\n");
        empList.print();
        
        //calculate total salary
       
        Employee emp = (Employee) empList.getFirst();
        double tot = 0;
        
        while (emp != null)
        {            
            tot=tot+emp.getEsalary();
            emp = (Employee) empList.getNext();
        }
        
        System.out.print("Total salary: RM" + tot);
        
        String pmax = " ";
        //kena ada sbb tdi pointer dh smpi null
        //need to have since the pointer already reach null
        emp = (Employee) empList.getFirst();
        //jadikan first link sebagai max
        // let the first link set as max
        double max = emp.getEsalary();
        pmax = emp.toString(); 
        //kena ada sbb dh jadikan first link sebagai max
        //need to have as the first link already set as max
        emp = (Employee) empList.getNext();
        while (emp!=null)
        {
            if (emp.getEsalary() > max)
            {
                max = emp.getEsalary();
                pmax = emp.toString();                
            }
            
            emp = (Employee) empList.getNext();
        }
        System.out.print("\n\nHighest salary: RM" + max);
        System.out.print("\nThe details of employee with max salary:" + "\n" + pmax);
        
        String special_id = " ";
        //String special_id_ = " ";
        emp = (Employee) empList.getFirst();
        while (emp != null)
        {
            
            if (emp.getEid().equals("123456"))
            {
                special_id = emp.toString();
                System.out.print("\n\nEmployee (ID=123456) : \n" + special_id);
            }

            emp = (Employee) empList.getNext();  
        }
        
        String error = "NOT FOUND IN THE LIST";
        if (special_id == " ")
        System.out.print("\n\nEmployee (ID=123456) : " + error);
    }
}
