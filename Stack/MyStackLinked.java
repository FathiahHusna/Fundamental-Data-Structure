
/**
 * Write a description of class MyStackLinked here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStackLinked <N>
{
    public Node stackTop;
    public Node newNode;


    public MyStackLinked()
    {
        stackTop = newNode = null;
    }
    
    public boolean emptyStack()
    {
        return stackTop == null;
    }
    
    public boolean fullStack()
    {
        return false;
    }
    
    public N top()
    {
        if (emptyStack())
            return null;

        else
        {
            newNode = stackTop;
            return (N) stackTop.data; 
        }
         
    }
    
    public void push(N item)
    {
        newNode = new Node (item);
        
        if (emptyStack())
            stackTop = newNode;
        
        else
        {
            newNode.next = stackTop;
            stackTop = newNode;
        }    
            
    }
    
    public N pop()
    {
       N removeItem = null;
       removeItem = (N) stackTop.data;
       
       if (emptyStack())
       {
           System.out.println("List is empty");
       }
       
       else 
       {
           stackTop = stackTop.next;
       }
       
       return removeItem;
    }
    
    public void displayStack()
    {
        Node current = stackTop;

        while ( current != null ) 
        {
            System.out.print( "\n" + current.data + " " );
            current = current.next;
        }

        System.out.println( "\n" );
    }
}
    

