//Mango
import java.util.*;
public class Fruits

{
    public static void main(String[]args)
    {
        ArrayList emp=new ArrayList();
        ArrayList<String>fruit=new ArrayList();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("mango");
        for(String f:fruit)
        {
            if (f.equals("mango"))
            {
                System.out.print("Mango is there in give Fruits");
            }
        }
    }
}