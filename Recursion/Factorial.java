
/**
 * Factorial fathiah copy anis (madam punya)
 */
public class Factorial
{
    public static int factorial (int num)
    {
        if (num == 0)
            return 1;
            
        else
        {
            num = num * factorial(num - 1);
            return num;
        }
    }
}
