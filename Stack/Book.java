
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String isbn_num;
    private String author;
    private String title;
    private double price;
    
    public Book()
    {
        isbn_num = " ";
        author = " ";
        title = " ";
        price = 0.0;
    }
    
    public Book(String isbn_num, String author, String title, double price)
    {
        this.isbn_num = isbn_num;
        this.author = author;
        this.title = title;
        this.price = price;
    }
    
    public String getISBN()
    {
        return isbn_num;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setBook (String isbn_num, String author, String title, double price)
    {
       this.isbn_num = isbn_num;
       this.author = author;
       this.title = title;
       this.price = price; 
    }
    
    public String toString()
    {
        return "ISBN num: " + isbn_num + "\nAuthor: " + author + "\nTitle: " + title + "\nPrice: RM" + price;
    }
}
