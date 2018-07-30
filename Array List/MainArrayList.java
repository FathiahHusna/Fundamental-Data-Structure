
/**
 * Assignemnt 2 [ArrayList Class]
 * Fathiah Husna Binti Firdaus
 * CS2304A
 */
import java.util.*;
public class MainArrayList
{
    public static void main(String[] args)
    {
        MyArrayList numList = new MyArrayList();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Numbers: ");
        int num = in.nextInt();
        
        //ex5 insert at front
        System.out.println("\nInsert " + num + " number(s): ");
        for (int i=0; i<num; i++)
        {   
            System.out.print("Number [" + i + "]:");
            int number = in.nextInt();
            numList.insertAtFront(number);
            
        }
        //displaying after insert at front
        System.out.println("\nAFTER INSERT AT FRONT:");
        numList.display();
        
        //ex7 insert at back
        System.out.println("\nInsert " + num + " number(s): ");
        for (int i=0; i<num; i++)
        {
            System.out.print("Number [" + i + "]:");
            int number = in.nextInt();
            numList.insertAtBack(number);
        }
        //displaying after insert at back
        System.out.println("\nAFTER INSERT AT BACK:");
        numList.display();
        
        //ex8 remove from front
        numList.removeFromFront(0);
        //displaying after remove from front
        System.out.println("\nAFTER REMOVE FROM FRONT:");
        numList.display();
        
        //ex10 remove from back
        numList.removeFromBack(4);
        numList.removeFromBack(3);
        //displaying after remove from back
        System.out.println("\nAFTER REMOVE FROM BACK:");
        numList.display();
        
        //ex12
        //Integer obj[] = new Integer[numList.size()];
        //ArrayList <Integer> obj = new ArrayList();
        MyArrayList objList = new MyArrayList();
        
        //ex13
        int tot=0;       
        for (int i=0; i<numList.size(); i++)
        {
            //typecast, tak guna generics
            //Integer nl = (Integer) numList.get(i);
            
            //no typecast required. use of generics
            //Integer nl = numList.get(i);
            //obj.add(nl);
            
            int objnum = numList.get(i);
            objList.insertAtBack(objnum);
            
            //calc total
            tot = tot + (Integer) objList.get(i);
        }

        System.out.println("\nTEST (after insert into obj array): ");
        for (int i=0; i<numList.size(); i++)
        {
            System.out.println(objList.get(i));
        }
        //display total
        System.out.print("\nTotal: " + tot);
        
        int avg=0;
        //calc avg
        avg = tot/objList.size();
        //display avg
        System.out.print("\nAvg: " + avg);
        
        //search for max
        int max=0;
        for (int i=0; i<objList.size(); i++)
        {
            if (objList.get(i) > max)
            {
                max = (Integer) objList.get(i);
            }            
        }
        
        //display max
        System.out.print("\nMax: " + max);
        
        //search for min
        int min=0;
        for (int i=0; i<objList.size(); i++)
        {
            if (objList.get(i) < max)
            {
                max = (Integer) objList.get(i);
            }            
        }
        
        //display min
        System.out.print("\nMin: " + max);
        
        //search for odd and even
        int ceven=0, codd=0;
        for (int i=0; i<objList.size(); i++)
        {
            if (objList.get(i)%2 == 0)
                ceven++;
                       
            else
                codd++;
        }
        
        //display odd and even
        System.out.print("\nEven num: " + ceven + "\nOdd num: " + codd);
    }
}
