
/**
 * Fathiah Husna Binti Firdaus
 * CS2304A 
 */
import java.util.*;
public class NotebookApp
{
   public static void main(String[] args)
   {
       //(a)
       BSTNotebook nbList = new BSTNotebook();
       Scanner in = new Scanner(System.in);
       
       //(b)
       System.out.print("\nTotal num: ");
       int n = in.nextInt();
       
       Notebook[] nb = new Notebook[n];
       for (int i=0; i<n; i++)
       {
           System.out.print("\nSerial Num: ");
           String serialNo = in.next();
           System.out.print("Brand: ");
           String brand = in.next();
           System.out.print("Price: RM");
           double price = in.nextDouble();
           System.out.print("Model: ");
           String model = in.next();
           
           nb[i] = new Notebook(serialNo, brand, price, model);
           nbList.insertNode(nb[i]);
       }
       
       // (c) display the tree
       System.out.println("\nALL PRODUCTS: ");
       nbList.displayAll();
        
       System.out.println(" \nPREORDER: ");
       nbList.preorderTraversal();   
        
       System.out.println(" \nPOSTORDER: ");
       nbList.postorderTraversal(); 
        
       System.out.println(" \nINORDER: ");
       nbList.inorderTraversal(); //void method
       
       // (d) count and display num hp notebooks >rm5000
       System.out.println("\n\nTotal HP > RM5000.00: " + nbList.countN() + " notebook(s)");
       
       // (e) display total price
       System.out.print("\nName a brand to calc total price: ");
       String brandPrice = in.next();
       System.out.print("TOTAL PRICE: RM" + nbList.totalPricetype(brandPrice));
       
       // (f)
       System.out.print("\n\nMAXIMUM PRICE: RM" + nbList.maxPrice());
       System.out.print("\nDetails: " + nbList.disMaxPrice());
        
   }

}
