//12. Write a JAVAprogram to count total number of notes in given amount.---
import java.util.Scanner;
 class Exercise12{
     public static void main(String[] args)
     {
         int amount,note=0,remain=0;
         
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter Amount:");
          amount=sc.nextInt();
          
         if(amount>0)
         {
             note=amount/500;
             remain=amount%100;
         } System.out.println("No.of 100 notes given Amount:"+note);
         System.out.println("Remaining Amount:"+remain);
         
     }   
     }