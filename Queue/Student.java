
/**
 * Write a description of class Studen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{   
    private String name,status;
    private int studId;
    private int part;
    private double cgpa;

    public Student ()
    {
        name = "";
        studId = 1;
        part = 1;
        cgpa = 1.0;
       
    }

    public Student ( String nm, int sid, int pt, double cg)
    {
        name = nm;
        studId = sid;
        part = pt;
        cgpa = cg;
    }

    public void setStudent ( String nm, int sid, int pt, double cg)
    {
        name = nm;
        studId = sid;
        part = pt;
        cgpa = cg;
    }

    public String toString()
    {
        return "\nName : " + name +
        "\nStudent ID :  " + studId + 
        "\nPArt : " + part + "\nCGPA : " + cgpa ;
        
    }
    
    public String getName() { return name; }
    public int getStudId()      { return studId; }
    public int getPart()        { return part; }
    public double getCgpa()     { return cgpa; }
}
