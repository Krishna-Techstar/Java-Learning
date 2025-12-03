import java.util.Scanner;

public class ElseIf2 {

    public static void main(String Args[]){
        int age ;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age >= 18){
            System.out.println("You are an Adult!!");

        } else if(age >= 18 && age <= 13) {
            System.out.println("You are an Teenager");
        }else {
            System.out.println("You are a child.");
        }

    }
}
