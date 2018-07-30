
/**
 * Write a description of class Ex1App here.
 * Fathiah Husna Binti Firdaus
 * CS2304a
 */
import java.util.*;
public class Ex1App
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);
        Ex1 myex1 = new Ex1();
        
        System.out.print("Enter value m: ");
        int x = in.nextInt();
        System.out.print("Enter value n: ");
        int y = in.nextInt();
        System.out.println("Output = " + myex1.ss(4,7));
        System.out.println("Output = " + myex1.Fathiahss(x,y));
    }
}
