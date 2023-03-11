package Zad1;

public class Main {
    public static void main(String[] args) {
        Disc.setVat(23.0);
        Disc d1 = new Disc("Samsung",1024,350.0);
        System.out.println(d1.toString());
        System.out.println("Kwota brutto: "+d1.getBruttoPrice());
    }
}
