package Level_4;
public class L08_ReverseOfNo {
    public static void main(String[] args){
        int n=678347;
        int rev = 0 ;
                
        while(n>0){
            int lastDigit = n%10;
            rev =(rev*10)+lastDigit;
            System.out.println( lastDigit);
            n/=10;
        }
        System.out.print(rev);
    }
}
