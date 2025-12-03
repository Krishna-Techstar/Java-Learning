// # even and odd number test
import java.util.Scanner;

public class Problem3 {
    public static void main(String Args[]){
         int n;
        Scanner sc = new Scanner(System.in);
           n = sc.nextInt();
        if (n%2==0){
            System.out.println("N Is a Even No."+n);
        }else{
            System.out.println("N is a Odd No."+n);
        }
    }
}
