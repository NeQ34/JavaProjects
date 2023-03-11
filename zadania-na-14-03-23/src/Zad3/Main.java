package Zad3;

public class Main {
    public static void main(String[] args) {
        Pracownik p = new Pracownik("Walter","White",22,54,0);
        Pracownik p2 = new Pracownik("Jesse","Pinkman",35,30,0);
        p2.wyswietl();
        p.wyswietl();
        p.zmienPremia(500);
        p.wyswietl();
        p.dajPodwyzke(20);
        p.wyswietl();
        System.out.println("Czy p pracuje wiecej niz p2? "+p.wiecejPracuje(p2));
    }
}
