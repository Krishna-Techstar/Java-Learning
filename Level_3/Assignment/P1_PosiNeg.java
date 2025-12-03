package Level_3.Assignment;
import java.util.*;
public class P1_PosiNeg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Number is "+ num);

        String PN = (num >0 )? "Positive":"Negitive";
        System.out.println(PN);
    }
}
