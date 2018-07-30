
/**
 * Fathiah Husna Binti Firdaus
 * CS2304A
 */
import java.util.*;
public class MainApp
{
   public static void main(String[] args)
   {
       MyStackLinked <Book> bookStack = new MyStackLinked <Book> ();
       MyStackLinked <Book> tempStack = new MyStackLinked <Book> ();
       MyStackLinked <Book> bookStack2 = new MyStackLinked <Book> ();
     
       
       Scanner in = new Scanner(System.in);
       
       System.out.print("\nInput: ");
       int n = in.nextInt();
      
       for (int i=0; i<n; i++)
       {
           System.out.print("\nISBN_num: ");
           String isbn = in.next();
           System.out.print("Author: ");
           String author = in.next();
           System.out.print("Title: ");
           String title = in.next();
           System.out.print("Price: RM");
           double price = in.nextDouble();
           
           Book myBook = new Book (isbn, author, title, price);
           bookStack.push(myBook);
       }
       
       System.out.print("\nContent: ");
       bookStack.displayStack();
       System.out.println("\nTop: " + bookStack.top());
       
       double total = 0;
       double data = 0;
       double max=0, min=9999;
       System.out.println("Search:");
       String search = in.next();
       while(!bookStack.emptyStack())
       {
           //tempStack.push(bookStack.pop());
           Book objBook = bookStack.pop();
           
           total = total + objBook.getPrice();
           if (objBook.getPrice() > max)
           {
               max = objBook.getPrice();
           }
           
           if (objBook.getPrice() < min)
           {
               min = objBook.getPrice();
           }
           
           if (objBook.getISBN().equals(search))
           {
               System.out.print("\nJumpa!!\n");
               System.out.println(objBook.toString());
               //break;
           }
           
           tempStack.push(objBook);
       }
            
       while(!tempStack.emptyStack())
       {
           //push lagi sekali utk dapatkan original order of the elements 
           //push again to get the original order of the elements
           bookStack2.push(tempStack.pop()); 
       }
       
       
       System.out.print("\nContent (after copied into second stack): ");
       bookStack2.displayStack();
       System.out.println("\nTop: \n" + bookStack2.top());
       
       System.out.print("\nTotal: RM" + total);
       System.out.print("\nMaximum Price: RM" + max);
       System.out.print("\nMinimum Price: RM" + min);
       
       
   }
}
