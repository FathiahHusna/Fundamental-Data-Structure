
/**
 * Write a description of class QueueApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class QueueApp
{
    public static void main(String[] args)
    {
        MyQueue q = new MyQueue(); //declare queue
        MyQueue q1 = new MyQueue();
        MyQueue q2 = new MyQueue();
        
        //create objects to store in the queue
        int n1 = 100;
        int n2 = 20;
        int n3 = 30;
        int n4 = 3;
        int n5 = 5;
        
        //use the enqueue methods to insert
        q.enQueue(new Integer (n1));
        q.enQueue(new Integer (n2));
        q.enQueue(new Integer (n3));
        q.enQueue(new Integer (n4));
        q.enQueue(new Integer (n5));
        
        System.out.println("\nContent of queue: ");
        q.print();
        
        //to display the first data
        System.out.print("\nFirst: " + q.getFront());
        
        int todd=0, teven=0;
        while (!q.isEmpty2())
        {
        //kena typecast sbb nk passkan object dlm bentuk int 
        //need to typecast bcause need to pass the obj in int
        //every time to perform operation need to dequeue first        
        Integer data = (Integer)q.deQueue();
        
        int num = data.intValue();
        //masukkan yg even num dlm q1
        //insert even num in q1
        if (num % 2 == 0)
        {
         q1.enQueue(data);
         teven = teven + num;
        }
        else
        {
            q2.enQueue(data);
            todd = todd + num;
        }
        } 
        
         
         
         System.out.println("\nContent of even queue: ");
         q1.print();
         
         System.out.println("\nContent of odd queue: ");
         q2.print();
         
        System.out.print("\nTotal Even: " + teven);
        System.out.print("\nTotal Odd: " + todd);
        
    }
}
