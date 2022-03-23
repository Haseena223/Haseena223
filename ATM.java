 1. Write a program to perform ATM operations such as deposit, withdrawand balance enquiry. Display list of options for user selection. 
import java.util.Scanner;
class ATM {
int wcount=1;
double bal=10000;
Scanner s=new Scanner(System.in);
public void deposit() {
int amt=0;
System.out.println("Enter deposit amount");
amt=s.nextInt();
bal=bal+amt;
System.out.println("Available bal : "+bal);
}
public void withdraw() {
int amt=0;
System.out.println("Enter withdraw amount");
amt=s.nextInt();
bal=bal-amt;
wcount++;
System.out.println("Available bal : "+bal);
}

