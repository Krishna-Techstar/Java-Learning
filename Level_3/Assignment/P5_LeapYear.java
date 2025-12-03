package Level_3.Assignment;
import java.util.*;
public class P5_LeapYear {
    public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int Year = sc.nextInt();

//         if ( Year % 4 == 0){
//             if(Year % 100 == 0)
//                 {
//                     if(Year % 400 ==0){
//                 System.out.println("Year is a Leap Year!");
//                      } 
//              }
//         }else{
//             System.out.println("Not a leap year");
            
//         }
//     }
Scanner sc = new Scanner(System.in);
 System.out.print("Input the year: ");
 int year = sc.nextInt();
 boolean x = (year % 4) == 0;
 boolean y = (year % 100) != 0;
 boolean z = ((year % 100 == 0) && (year % 400 == 0));
 if (x && (y || z)) {
 System.out.println(year + " is a leap year");
 } else {
 System.out.println(year + " is not a leap year");
 }
 }
}
