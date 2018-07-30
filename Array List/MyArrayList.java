
/**
 * Write a description of class MyArrayList here.
 * built in arrayList
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArrayList
{
    //default initial capasity
    private static final int INITIAL_CAPACITY = 10;
    private int[] numberList; //the array hold the list of elements
    private int size; //the current size
    private int capacity=0; //the current capsity
    
    //ex1
    //default constructor
    //creates an array of size 10
    public MyArrayList()
    {
        numberList = new int[INITIAL_CAPACITY];
        capacity = INITIAL_CAPACITY;
    }
    
    //ex2
    //check if size is empty
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    //ex2
    //check if size is full
    public boolean isFull()
    {
        return size == capacity;
    }
    
    //ex2
    //return the number of elements in the list
    public int size()
    {
        return size;
    }
    
    //ex2
    public int get(int index)
    {
        if (index<0 || index>=size)
            throw new ArrayIndexOutOfBoundsException(index);
        
        else
        {
            return numberList[index];
        }
    }
    
    //ex3
    public boolean insertAtFront(int theValue)
    {
        if (isFull())
            System.out.println("FULL");
        
        else 
        {
            for (int i=size; i>0; i--)
            {
                numberList[i] = numberList[i-1];
            }
            
            numberList[0]= theValue; //insert 
            //when insert, the size increase. so increment the size
            size++;
        }
        
        return true;
       
    }
    
    //ex4
    public void display()
    {
        System.out.println("List of numbers: ");
        for (int i=0; i<size(); i++)
        {
            System.out.println(numberList[i]);
        }
    }
    
    //ex6
    public boolean insertAtBack(int theValue)
    {
        if (isFull())
            System.out.println("FULL");
            
        else
        {
            numberList[size] = theValue;
            size++;
        }
        return true;
    }
    
    //ex8
    public Object removeFromFront(int index)
    {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException(index);
        
        else
        {
            Object returnValue = numberList[0];
            for (int i=index; i<size; i++)
            {
                numberList[i] = numberList[i+1];
            }
            size--;
            return returnValue;
        }       
    }
    
    //ex10
    public Object removeFromBack(int index)
    {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException(index);
            
        else
        {
            Object returnValue = numberList[index];
            size--;
            return returnValue;
        }
        
    }
}
    
