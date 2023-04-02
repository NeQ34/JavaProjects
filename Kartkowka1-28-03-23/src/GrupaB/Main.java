package GrupaB;

import GrupaA.KontoBankowe;

public class Main {
    public static void main(String[] args) {
        KartaKredytowa k1 = new KartaKredytowa("70 1410 2006 0000 3200 0926 4671",1000.0,5000.0);
        System.out.println(k1);
        System.out.println(k1.zaplac(3999));
        System.out.println(k1);
        k1.dokonajSplaty(2500);
        System.out.println(k1);
    }
}
