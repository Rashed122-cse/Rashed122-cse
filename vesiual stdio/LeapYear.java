import java.util.Scanner;

 public class LeapYear {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Year: ");
         int year = input.nextInt();

           boolean isLeapYear =((year % 4 == 0) && ((year % 400== 0) || (year % 100!= 0)));

         if (//(year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0)))
            // (year % 400 == 0) || ((year % 4 ==0) && (year % 100 != 0)))
            isLeapYear)
             {
             System.out.println(year + " is leap year");
         } else {
             System.out.println(year + " is not a leap year");
         }
     }
 }