package Level_6;

public class L14_BintoDec {
    
    public static void bintodec(int binnum){
        int myNum = binnum;
        int pow = 0;
        int decNum = 0;

        while(binnum > 0){
            int lastDigit = binnum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow ++;
            binnum =binnum /10;

        }
        System.out.println("Decimal of "+ myNum +" = "+ decNum);
    }
    
    public static void main(String[] args) {
        bintodec(101);
    }
}


