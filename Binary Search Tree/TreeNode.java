
/**
 * Write a description of class TreeNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeNode
{
    //reference variable
    TreeNode left; //left nde
    Notebook data; //data item
    TreeNode right; //right node
    
    //constructor
    public TreeNode(Notebook d)
    {
        data = d;
        left=right=null;
    }
    
    //insert a TreeNode into a Tree that contains node
    //ignore duplicate values
    public void insert(Notebook d)
    {
        if (d.getPrice()<data.getPrice()) //smaller
        {
            if (left==null) //kalau null //if null
                left = new TreeNode(d); //create node
            
            else 
                left.insert(d); //recursive call insert()
        }
        else if (d.getPrice()>data.getPrice()) //greater 
        {
            if (right==null)
                right = new TreeNode(d); //create node
            
            else
                right.insert(d); //recursive call insert()
        }
    }
}
