
/**
 * Write a description of class QueueArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QueueArray
{
    //need to know data needed in QueueArray
    //going to insert Student objects in Queue array
    
    //declaring variable 
    //default initial capacity
    private static final int max_capacity = 10;
    private Object[] theData; //array to hold the list elements
    private int size; //the current size
    private int front;
    private int rear;
    
    
    //constructor
    public QueueArray()
    {
        theData = new Object[max_capacity];
        front = size = 0;
        rear = size-1;
    }
    
    //method isEmpty()
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    //method isFull()
    public boolean isFull()
    {
        return size == max_capacity;
    }
    
    //method size()
    public int size()
    {
        return size;
    }
    
    //method enqueue()
    //bcause want to insert item, so need to have parameter
    public void enqueue(Object item) //sebab nk add item, so kena ada parameter 
    {
        //make sure the queue is not full before inserting item
        if (isFull())
            System.out.print("Sorry full already!!");
            
        else 
        {
            rear = (rear+1) % max_capacity;
            theData[rear] = item;
            size++;
        }
    }
    
    
    //method dequeue()
    //will remove the front item 
    //bcause need to remove, so no need to pass the parameter
    public Object dequeue() //sebab nk remove, so x perlu pass parameter
    {
        Object removeItem = theData[front]; //store the removed in one variable
        
        //check ada content ke x utk remove
        //check if there is any content to be removed
        if (isEmpty())
            System.out.print("Sorry, nothing to be removed!");
            
        else 
        {          
            front = (front+1) % max_capacity;
            size--;
        }
        
        return removeItem;
    }
    
    //method getRear()
    public Object getRear()
    {
        return theData[rear];
    }
    
    //method getFront()
    public Object getFront()
    {
        return theData[front];
    }
    
    //method print()
    public void print()
    {
        
        for (int i=front; i<=rear; i++)
        {
            System.out.println(theData[i]);
        }
    }
}
