
/**
 * FactorialApp fathiah copy anis (madam punya)
 */
import java.util.*;
public class FactApp
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);
        Factorial fact = new Factorial(); //creating factorial object
        
        String num;
        int n;
        System.out.println("Enter value n: ");
        n = in.nextInt();
        System.out.println("Output = " + fact.factorial(n));
    }
}
