 //Input a year and find whether it is a leap year or not.

 import java.util.*;
 
 public class Leapyear {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a year:");
         int year = sc.nextInt();

         if (year % 400 == 0){
            System.out.println(year + "is a ;eap year");
         }else{
            System.out.println(year + "is not a leap year");
         }
         sc.close();
     }
 }
 