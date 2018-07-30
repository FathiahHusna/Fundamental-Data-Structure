
/**
 * Write a description of class Ex3App here.
 * Fathiah Husna Binti Firdaus
 * CS2304a
 */
import java.util.*;
public class Ex3App
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        Ex3 myex3 = new Ex3();
        
        System.out.print("Enter value x: ");
        int x = in.nextInt();
        System.out.print("Enter value y: ");
        int y = in.nextInt();
        System.out.println("Output = " + myex3.square(x,y));
    }
}
