import java.util.*;
class Integer
{
public static void main(String args[])
{
ArrayList<Integer> al=new ArrayList();
Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++){
System.out.println("enter a value");
al.add(sc.nextInt());
}
for(Integer n:al)
{
System.out.println(n);
}
}
}