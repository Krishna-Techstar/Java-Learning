package Level_6;

public class L06_product {

    public static int product(int num1 , int num2){
        int multiple = num1*num2;
        // System.out.println(multiple);
        return multiple;
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        int pro = product(a,b);
        System.out.println(pro);
    }
}
