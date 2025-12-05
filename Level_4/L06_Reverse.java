package Level_4;

public class L06_Reverse {
    public static void main (String [] args){
        int n = 23456;
        while (n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n/=10;
        }
    }
}
