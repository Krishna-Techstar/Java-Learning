package Level_3.Assignment;
import java.util.*;


public class P2_UserTemp{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double Temp = sc.nextDouble();
        if (Temp > 100 ){
            System.out.println("You have a Fever");
        }else {
            System.out.println("You dont have a Fever");
        }

    }
}