package Level_4;
import java.util.*;
public class L04_Sum {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i= 1;
        int sum = 0;

        while(i<=n){
            System.out.print(" "+i);
            sum += i;
            i++;
            System.out.println();
        }
        
        System.out.println(sum);
    }
}
