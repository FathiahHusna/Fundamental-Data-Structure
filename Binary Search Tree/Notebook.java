
/**
 * Write a description of class Notebook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Notebook
{
    private String serialNo;
    private String brand; //hp, acer, lenovo
    private double price;
    private String model; //hp probook, acer aspire, lenovo pad
    
    //constructor
    public Notebook(String serialNo, String brand, double price, String model)
    {
        this.serialNo = serialNo;
        this.brand = brand;
        this.price = price;
        this.model = model;
    }
    
    //getter 
    public String getSN()
    {
        return serialNo;
    }
    
    public String getBrand()
    {
        return brand;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public String toString()
    {
        return "\nSerialNo: " + serialNo + "\nBrand: " + brand + "\nPrice: RM" + price + "\nModel: " + model;
    }
    
    //accessor
    public void setNotebook(String serialNo, String brand, double price, String model)
    {
        this.serialNo = serialNo;
        this.brand = brand;
        this.price = price;
        this.model = model;
    }
}
