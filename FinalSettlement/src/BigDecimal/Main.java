package BigDecimal;

import javax.swing.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("98456456.84564596");
        BigDecimal d2 = new BigDecimal("09485656.54648566");

        int znak = d1.compareTo(d2);
        if(znak==0) System.out.println("Liczby są sobie równe");
        else if(znak<0) System.out.println("d1<d2");
        else System.out.println("d1>d2");


        KontoBankowe k1 = new KontoBankowe("Szaweł", "84765649534",new BigDecimal("10000"));
        KontoBankowe k2 = new KontoBankowe("Włodzimierz", "756474939266",new BigDecimal("8000000"));
        KontoBankowe k3 = new KontoBankowe("Heniek", "173465957485",new BigDecimal("500000"));

        k1.info();
        k2.info();
        k3.info();

        k1.wyplac(new BigDecimal("8000"));
        k2.dodajHajs(new BigDecimal("5000000"));

        int x = k1.getSaldo().compareTo(k2.getSaldo());
        if(x==0) System.out.println("Kwoty są takie same");
        else if(x<0) System.out.println(k1.getName()+" ma więcej hajsu od "+k2.getName());
        else System.out.println(k2.getName()+" ma więcej hajsu od "+k1.getName());
    }
}
