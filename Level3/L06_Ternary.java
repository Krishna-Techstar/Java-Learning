import java.util.Scanner;

public class L06_Ternary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();        
        // int number = 24;
        String type = (number % 2 == 0) ? "Even": "Odd";
        System.out.println(type);
    }
}
