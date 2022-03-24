create maximu 10 interger values 
import java.util.*;
 
public class Max {
 
    public static void main(String[] args) {
        
        ArrayList<Integer> aListMarks = new ArrayList<Integer>();
        
        //add elements to ArrayList

        aListMarks.add(1);
        aListMarks.add(4);
        aListMarks.add(7);
        aListMarks.add(10);
        aListMarks.add(2);
        aListMarks.add(6);
        aListMarks.add(9);
        aListMarks.add(3);
        
        
        System.out.println( "ArrayList Max Value: " + Collections.max(aListMarks) );
 
    }
}
