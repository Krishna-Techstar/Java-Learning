package Level_6;
import java.util.*;
public class L02_Sum {
    // this is basically method 1 where we are using void which dont have any return type 
    public static void calculateSum(int num1, int num2){
        int sum = num1 + num2 ;
        System.out.println("Sum is : "+ sum);

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);
    }
}
