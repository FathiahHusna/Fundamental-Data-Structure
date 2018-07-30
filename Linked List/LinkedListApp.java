
/**
 * Write a description of class LinkedListApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class LinkedListApp
{
    public static void main( String args[] )
    {
        MyLinkedList objList = new MyLinkedList();  // Step 1: create the LinkedList object
        Scanner in = new Scanner (System.in);
        
        System.out.print("Number students: ");
        int snum = in.nextInt();
        
        // Step 2: Input data for object
        for (int i=0; i<snum; i++)
       {
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Part: ");
            int part = in.nextInt();
            System.out.print("Cgpa: ");
            double cgpa = in.nextDouble();
            // Step 3: Create and store data into objectm
            //call the constructor
            Student student = new Student(name, id, part, cgpa);           
            // Step 4: insert object into linked list
            objList.insertAtFront(student);         
       }
       
       System.out.print("\nINSERT AT FRONT");
       objList.print();
       
       for (int i=0; i<snum; i++)
       {
          System.out.print("Name: ");
          String name = in.next();
          System.out.print("ID: ");
          int id = in.nextInt();
          System.out.print("Part: ");
          int part = in.nextInt();
          System.out.print("Cgpa: ");
          double cgpa = in.nextDouble();
          // Step 3: Create and store data into object
          //call the constructor
          Student student = new Student(name, id, part, cgpa);           
          // Step 4: insert object into linked list
          objList.insertAtBack(student);  
        }
       
        System.out.print("\nINSERT AT BACK");
       objList.print();
       
       objList.removeAtFront();
       System.out.print("\nREMOVE AT FRONT");
       objList.print();
        
        
        
        // display the contents of the linked list  
            
        // To find the highest cgpa
        // access first element in the list
       
    }
}
