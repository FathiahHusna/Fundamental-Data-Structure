
/**
 * Write a description of class Ex4App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Ex4App
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        Ex4 myex4 = new Ex4();
        
        System.out.print("Enter value n: ");
        int n = in.nextInt();
        
        //System.out.println("Output = " + myex4.kita(n));
        System.out.println("Output = " + myex4.S(n));
    }
}
