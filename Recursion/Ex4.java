
/**
 * Write a description of class Ex4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * DEC2016
 */
public class Ex4
{
    public static String kita(int n)
    {
        //String mark = "!";
        //String star = "*";
        
        if (n==0)
            return "";
            
        else
            return "*" + kita(n-1) + "!";
    }
    
    public static int S(int n)
    {
        if (n==1)
            return 3;
        
        else 
            return (n - S(n/2));
            
  
    }
}
