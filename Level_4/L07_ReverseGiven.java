package Level_4;
import java.util.*;

public class L07_ReverseGiven {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n/=10;
        }
    }
}
