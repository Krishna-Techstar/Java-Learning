import java.util.Scanner;

public class L08_Switch {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int Num = sc.nextInt();

    switch(Num){
        case 1: System.out.println("Your are a Monkey");
        break;
        case 2: System.out.println("Your are a Donkey");
        break;
        case 3: System.out.println("Your are a Ronkey");
        break;    
    }
    }
    
}
