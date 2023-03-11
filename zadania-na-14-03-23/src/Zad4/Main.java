package Zad4;

public class Main {
    public static void main(String[] args) {
        Samochod s1 = new Samochod("Skoda","Octavia","WZ0634",8,250,50,2018);
        Samochod s2 = new Samochod("Audi","A5","LKR0915",11,300,45,2015);
        System.out.println(s1.toString());
        s1.zmienNrRej("LCH4146");
        System.out.println(s1.toString());
        s1.zatankuj(50);
        s1.jedz(100);
        System.out.println(s1.toString());
        System.out.println("Czy s1 starszy od s2? "+s1.czyStarszy(s2));
        s1.wykonajTuning(70);
        s1.setPredkoscAktualnia(80);
        s1.przyspiesz(30);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
