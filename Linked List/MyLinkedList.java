/* The implementation of a linked list
 * Reference: Java: How To Program (Deitel & Deitel)
 * author : Zulaile Mabni
 */

//Node definition
import java.util.*;
import java.util.Scanner;
class Node //no need to put 'public'. one class may consists of one 'public' only
{
   // package access data so class List can access it directly
   Object data; //can store any object
   Node next; //pointer to the next node

   // Constructor: Create a Node that refers to Object o.
   Node( Object obj ) //one parameter
   { //this( o, null ); 
       data = obj;
       next = null;
   }

   // Constructor: Create a Node that refers to Object o and
   // to the next Node in the List.
   Node( Object o, Node nextNode ) //two parameter
   {
      data = o;         // this node refers to Object o
      next = nextNode;  // set next to refer to next
   }

   // Return a reference to the Object in this node
   Object getObject() { return data; }

   // Return the next node
   Node getNext() { return next; }
}

// LinkedList definition
public class MyLinkedList 
{
   //reference variable
   private Node head;
   private Node tail;
   private Node newNode; // use to traverse the list
  
   // Constructor: Construct an empty List 
   public MyLinkedList()
   {
      head = tail = newNode = null;
   }

   // Return true if the List is empty
   public boolean isEmpty()
   { 
    return head==null;
   }

   // Return First element
   public Object getFirst()
   {
       if (isEmpty())
            return null;
       
       else 
       {
            newNode = head;
            return newNode.data;
       }
   }
     
   // Return next element
     public Object getNext()
   {
         if (newNode != tail)
         {
                newNode = newNode.next;
                return newNode.data;
         }
         
         else
                return null;
     }
     
    // Display the content of linked list 
   public void print()
   {
        /*if ( isEmpty() ) {
         System.out.println( "The list is Empty ");
         return;
        } */

        System.out.print( "\nThe contents of the linked list is: " );

        Node current = head;

        while ( current != null ) 
        {
            System.out.print( "\n" + current.data + " " );
            current = current.next;
        }

        System.out.println( "\n" );
   }

   public int size()
   {
       int count = 0;
       Node position = head;
    
       while (position != null)
       {
           count++;
           position = position.next;
       }
    
       return count;
   }
 
    // Insert an Object at the front of the List
   // If List is empty, head and tail will refer to
   // the same object. Otherwise, head refers to new node.
   
   public void insertAtFront( Object insertItem )
   { 
       newNode = new Node(insertItem);
       //check if linked list is null
       if (isEmpty())
       {
           head = tail = newNode;
       }
       
       //check if linked list not null
       else
       {
           newNode.next = head;
           head = newNode;
       }
   }

   // Insert an Object at the end of the List
   // If List is empty, head and tail will refer to
   // the same Object. Otherwise, tail's next instance
   // variable refers to new node.
   public void insertAtBack( Object insertItem )
   { 
       newNode = new Node(insertItem);
       
       if (isEmpty())
       {
           head=tail=newNode;
       }
       
       else
       {
           tail.next = newNode;
           tail = newNode;
       }
   } 

   // Remove the first node from the List.
   public Object removeAtFront()
   { 
       Object removeItem = null;
       removeItem = head.data;
       
       if (isEmpty())
       {
           System.out.println("List is empty");
       }
       
       //kalau ada satu link
       //if there is only one link
       else if (head==tail) //sebab head dan tail point satu node yg sama //head and tail point to the same node
       {
           head=tail=null;
       }
       
       //kalau node lebih satu
       //if node more than one
       else
       {
           head=head.next;
       }
       
       return removeItem;
   }
   
   
   private Node rnewNode;
   // Remove the last node from the List.
   public void removeAtBack() 
   { 
       //kalau takde link
       //if there is no link
       if (isEmpty())
           System.out.println("List is empty");
       
       //kalau ada satu je 
       //if there is only one
       else if (head==tail) //sebab head dan tail point satu node yg sama //bcause head and tail point to the same node
           head=tail=null;
       
       //ada more than one 
       //there is more than one
       else     
           rnewNode = head;
           
           while(rnewNode.next != tail)
            rnewNode = rnewNode.next;
            
           tail = rnewNode;
           rnewNode.next = null;     
   }
  


}
