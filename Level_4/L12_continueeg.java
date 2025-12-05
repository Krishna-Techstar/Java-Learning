package Level_4;
import java.util.*;
public class L12_continueeg {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter Number");
            int n = sc.nextInt();

            if(n%10==0){
                continue;
            }
            if(n ==1 ){
                break;
            }
            System.out.println("Your No is "+ n);
        }while(true);

    }
}
