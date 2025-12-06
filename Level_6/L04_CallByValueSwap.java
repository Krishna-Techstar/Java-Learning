package Level_6;

public class L04_CallByValueSwap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // swap

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A is "+ a);
        System.out.println("B is "+ b);
    }
}
