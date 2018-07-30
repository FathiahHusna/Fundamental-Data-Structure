
/**
 * Write a description of class Ex2App here.
 * Fathiah Husna Binti Firdaus
 * CS2304a
 */
import java.util.*;
public class Ex2App
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);
        Ex2 myex2 = new Ex2();
        
        
        System.out.print("Enter value n: ");
        int n = in.nextInt();
        System.out.println("Output = " + myex2.sum(n));
    }
}
