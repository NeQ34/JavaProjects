package BigInteger;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger wynik = silnia(50);
        System.out.println("50! = "+wynik);
    }
    public static BigInteger silnia(int n){
        BigInteger silnia = BigInteger.ONE;
        for(int i=1; i<=n; i++){
            silnia = silnia.multiply(BigInteger.valueOf(i));
        }
        return silnia;
    }
}
