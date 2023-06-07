package zadanie4;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger wynik = fib(1000);
        System.out.println("fib: "+wynik);
    }
    public static BigInteger fib(int n){
        if(n<=1) return BigInteger.valueOf(n);

        BigInteger prevPrev = BigInteger.ZERO;
        BigInteger prev = BigInteger.ONE;
        BigInteger current = BigInteger.ZERO;

        for (int i=2; i<=n; i++) {
            current = prevPrev.add(prev);
            prevPrev = prev;
            prev = current;
        }
        return current;
    }
}
