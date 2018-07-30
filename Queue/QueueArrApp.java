
/**
 * Write a description of class QueueArrApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class QueueArrApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        QueueArray stuq = new QueueArray();
        QueueArray stuq1 = new QueueArray();
        Student stuList = new Student();
        
        System.out.print("Number of student(s): ");
        int n = in.nextInt();
        
        System.out.println("\nInsert data:");
        for (int i=0; i<n; i++)
        {
            System.out.print("NAME: ");
            String name = in.next();
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("PART: ");
            int part = in.nextInt();
            System.out.print("CGPA: ");
            double cgpa = in.nextDouble();
            
            stuList = new Student(name, id, part, cgpa); //call cosntructor
            
            System.out.print("\n");
            
            stuq.enqueue(stuList); //inserting student objects
        }
        
        System.out.print("CONTENT: After inserting contents");
        stuq.print();
        
        //remove object at front
        //Object removestu = stuq.dequeue();
        //System.out.print("\nCONTENT: After removing front");
        //stuq.print();
        
        //System.out.println("\nRemoved item: " + removestu.toString());
        
        
        //typecast
        //Student objStu = (Student) stuq.dequeue();
        //System.out.print("\nDetails of dequeue object");
        //System.out.println(objStu.toString());
        
        //System.out.print("\nCONTENT: After dequeue");
        //stuq.print();
        
        //remove student object with cgpa >3.0, and insert to q2
        while(!stuq.isEmpty())
        {
            Student objStu = (Student) stuq.dequeue();
            
            double temp = objStu.getCgpa();
            
            if (temp >3.0)
            {
                stuq1.enqueue(objStu);
            }
        }
        
        //display q2
        System.out.print("\nCONTENT: After enqueue (stuq1)");
        stuq1.print();
        
        System.out.print("\nCONTENT: After enqueue (stuq)");
        stuq.print();
    }
}
