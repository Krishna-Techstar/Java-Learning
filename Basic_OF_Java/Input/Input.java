package Basic_OF_Java.Input;
import java.util.*;


public class Input {
    // here we will learn how to take input form user 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // only Print the Firstly word or till space after space it doesnot even see what is written.
        String input = sc.next(); 
        System.out.println(input);

         // Print every thing what ever is there 
        String name = sc.nextLine();
        System.out.println(name);

        // To take No. Input 
        int number = sc.nextInt();
        System.out.println(number);

        float num =sc.nextFloat();
        System.out.println(num);
    }
}
