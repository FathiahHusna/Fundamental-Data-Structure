
/**
 * Write a description of class MyQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueue extends MyLinkedList
{
   public MyQueue()
   {
       
   }
   
   //tambah item
   //insert item
   public void enQueue(Object item)
   {
       insertAtBack(item);
   }
   
   //remove item
   public Object deQueue()
   {
       return removeAtFront();
    }
    
    //utk check kalau empty
    //to check if empty
    public boolean isEmpty2()
    {
        return isEmpty();
    }
        
    //utk check kalau penuh
    //to check if full
    public Object isFull()
    {
      return isFull();
    }
    
    //utk dpt kan yg pertama
    //to retrieve the first element
    public Object getFront()
    {
        return getFirst();
    }
    
    //utk dpt kan yg last
    //to retrieve the last element
    public Object getRear()
    {
        return getLast();
    }
}



