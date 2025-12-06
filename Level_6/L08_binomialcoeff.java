package Level_6;

public class L08_binomialcoeff {
    
    public static int factorial(int n){
        int f = 1;

        for (int i = 1 ; i<=n ; i++){
            f = f*i;
        }
        return f;
    }

    public static int binomial(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binocoeff = fact_n / (fact_r * fact_nmr);
        return binocoeff;
    }

    public static void main(String[] args) {
        System.out.println(binomial(5, 2));
    }
    
}
