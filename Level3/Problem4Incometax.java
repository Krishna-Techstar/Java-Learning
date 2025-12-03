import java.util.Scanner;

public class Problem4Incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

    if (income <= 500000){
            tax= (int) (income * 0.0);
            System.out.println(" Your Total Tax is "+ tax);
    }else if (income > 500000 &&income <= 1000000){
            tax = (int) (income * 0.20);
            System.out.println(" Your Total Tax is "+ tax);

    }else if (income >= 1000000){
            tax = (int) (income * 0.30);
            System.out.println("Your total Tax is "+ tax);
    }else {
    System.out.println("out of range ");
    }
    }
}
