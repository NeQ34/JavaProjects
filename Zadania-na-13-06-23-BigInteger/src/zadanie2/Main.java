package zadanie2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1234567890.123456789");
        BigDecimal b2 = new BigDecimal("9876543210.987654321");

        BigDecimal suma = b1.add(b2);
        System.out.println("Suma = "+suma);

        BigDecimal roznica = b1.subtract(b2);
        System.out.println("Roznica: "+roznica);

        BigDecimal iloczyn = b1.multiply(b2);
        System.out.println("Roznica: "+iloczyn);
    }
}
