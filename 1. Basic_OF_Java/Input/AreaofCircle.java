package Basic_OF_Java.Input;
import java.util.*;

public class AreaofCircle {
    public static void main(String args[]){
        System.out.println("Enter Radius of Circle");
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double Area = 3.14 * rad * rad;
        System.out.println(Area);
    }
}
