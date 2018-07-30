
/**
 * Write a description of class function1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class function1
{
   public static int function1(int b, int e)
   {
        int temp = 1;
        for (int j = 1; j <= e; j++)
            temp *= b;
            return temp;
   }
   
   public static void main(String a[])
   {
       System.out.println("First call= " + function1(4,0));
       System.out.println("Second call= " + function1(2,5));
       System.out.println("Third call= " + function1(3,3));
   }
}
