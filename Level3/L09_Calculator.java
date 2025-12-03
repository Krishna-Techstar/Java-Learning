import java.util.Scanner;


public class L09_Calculator {
    public static void main(String[] args){
        System.out.println("Welcome to the Amazing Calculator!!");
        System.out.println("Please Select the Option Which YOu wanne Perfrom!!");
        System.out.println("1. Addtion");
        System.out.println("2. Subtraction");
        System.out.println("3. Multipication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Percentage");
        Scanner sc = new Scanner(System.in);
        int Option = sc.nextInt();


        switch(Option){
            case 1:
                System.out.println("Enter Value Of First Digit");
                float a = sc.nextFloat();
                System.out.println("Enter Value of Second Digit");
                float b = sc.nextFloat();
                float Sum = a+b;
                System.out.println("addition of 2 Digit is "+Sum);
            break;
            case 2:
                System.out.println("Enter Value Of First Digit");
                float C = sc.nextFloat();
                System.out.println("Enter Value of Second Digit");
                float D = sc.nextFloat();
                float Sub = C-D;
                System.out.println("Subtraction of 2 Digit is "+Sub);
            break;
            case 3:
                System.out.println("Enter Value Of First Digit");
                float e = sc.nextFloat();
                System.out.println("Enter Value of Second Digit");
                float f = sc.nextFloat();
                float MUl = e*f;
                System.out.println("Multiplication of 2 Digit is "+MUl);
            break;
            case 4:
                System.out.println("Enter Value Of First Digit");
                float g = sc.nextFloat();
                System.out.println("Enter Value of Second Digit");
                float h = sc.nextFloat();
                float Div = g/h;
                System.out.println("Division of 2 Digit is "+Div);
            break;
            case 5:
                System.out.println("Enter Value Of First Digit");
                float i = sc.nextFloat();
                System.out.println("Enter Value of Second Digit");
                float j = sc.nextFloat();
                float mod = i%j;
                System.out.println("Modulas of 2 Digit is "+mod);
            break;
            case 6:
                System.out.println("Enter Value Of First Digit");
                float k = sc.nextFloat();
                System.out.println("Enter Value of Second Digit");
                float l = sc.nextFloat();
                float Percentage = k/l*100;
                System.out.println("Percentage of 2 Digit is "+Percentage);
            break;
            default: System.out.println("Out Of Range!!");
        }
    }
}
