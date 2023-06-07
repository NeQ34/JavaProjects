package zadanie3;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(obliczPotege(BigInteger.valueOf(2),10));
    }
    public static BigInteger obliczPotege(BigInteger podstawa, int wykladnik){
        BigInteger wynik = BigInteger.ONE;
        for(int i=0; i<wykladnik; i++){
            wynik = wynik.multiply(podstawa);
        }
        return wynik;
    }
}
