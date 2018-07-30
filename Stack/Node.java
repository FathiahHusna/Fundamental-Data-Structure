
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node
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
