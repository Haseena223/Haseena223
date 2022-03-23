Write a program to Calculate Electricity Bill. Accept last month units and present units in string format from the user.Calculate Electricity Bill for last month units, otherwise throw ArithementicException along with some error message.Handle NumberFormatException while converting units into numerical value.
import java.util.*;
public class ElectricityBill {

 public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("Enter last month units and present units");
String lunits=s.next();
String punits=s.next();
int lunits1=0;
int punits1=0;
double bill=0;
try{
lunits1=Integer.parseInt(lunits);
punits1=Integer.parseInt(punits);
}
catch(NumberFormatException e){
System.out.println(e);
}
// check lunits1>punits if condition is true throw ArithmeticException
if(lunits1>punits1){
throw new ArithmeticException("Invalid units");
}
else{
// find number of units
int units=punits1-lunits1;
// calculate bill
if(units<=50) {
bill= (0.50*units);
}
else if(units<=150) {
bill=(50*0.50)+(units-50)*1.75;
}
else if(units<=250){
bill=(50*0.50)+(100*1.75)+(units-150)*2.50;
}
else {
bill=(50*0.50)+(100*1.75)+(100*2.50)+(units-250)*2.90;
}
}
// add 10% surcharge to bill
bill=bill+(bill/100)*10;
System.out.println("Bill : "+bill);

 }