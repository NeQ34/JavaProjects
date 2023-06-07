package zadanie1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Laptop",new BigDecimal("2499.99"),5,Kategoria.ELEKTRONIKA);
        Produkt p2 = new Produkt("Koszulka",new BigDecimal("39.99"),18,Kategoria.ODZIEZ);
        Produkt p3 = new Produkt("Ksiazka",new BigDecimal("19.99"),12,Kategoria.KSIAZKI);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Calkowita cena: "+p1.obliczCeneCalkowita());
        System.out.println("Calkowita cena: "+p2.obliczCeneCalkowita());
        System.out.println("Calkowita cena: "+p3.obliczCeneCalkowita());

        Produkt[] p = {p1,p2,p3};

        System.out.println("Cena calkowita produktow: "+obliczWartoscCalkowita(p));
    }
    public static BigDecimal obliczWartoscCalkowita(Produkt[] p){
        BigDecimal suma = BigDecimal.ZERO;
        for(int i=0; i<p.length; i++){
            suma = suma.add(p[i].obliczCeneCalkowita());
        }
        return suma;
    }
}
