package Level_6;

public class L05_Callbyreferenceswap {
    
    public static void callByReference(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
     public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // swap
        callByReference(a,b);
        System.out.println("A is "+ a);
        System.out.println("B is "+ b);
    }
}

// this is not possiable in java as java only work by call by value and cpp works by call by reference 