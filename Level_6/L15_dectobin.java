package Level_6;

public class L15_dectobin{

    //  public static void bintodec(int binnum){
    //     int myNum = binnum;
    //     int pow = 0;
    //     int decNum = 0;

    //     while(binnum > 0){
    //         int lastDigit = binnum % 10;
    //         decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
    //         pow ++;
    //         binnum =binnum /10;

    //     }
    //     System.out.println("Decimal of "+ myNum +" = "+ decNum);
    // }
    public static void dectobin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binnum = 0;
        while(decNum > 0){
            int rem = decNum % 2;
            binnum = binnum + (rem * (int)Math.pow(10, pow));
            pow ++;
            decNum = decNum/2;
        }
        System.out.print("Binary Of "+ myNum + " = "+binnum);
    }
    public static void main(String[] args) {
        dectobin(7);
    }
}