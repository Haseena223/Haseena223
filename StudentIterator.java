import java.util.*;
public class StudentIterator
{
public static void main(String[] args) {
ArrayList<String> stu=new ArrayList();
stu.add("1234");
stu.add("Haseena");
stu.add("MCA");
stu.add("0123456789");
stu.add("14");
stu.add("hasee");
System.out.println("student Details");
Iterator itr=stu.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

}
}