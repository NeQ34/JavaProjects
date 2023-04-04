package Zadanie1;

public class Main {
    public static void main(String[] args) {
        Publication p1 = new Publication("Czysty kod. Podręcznik dobrego programisty", "9788383223445", 52.28, 1);
        p1.display();
        p1.buy(3);
        System.out.println("Liczba egzemplarzy książki o tytule '"+p1.getTitle()+"' po zakupie wynosi "+p1.getQuantity());
        p1.raise(5);
        System.out.println("Cena książki '"+p1.getTitle()+"' po 5% podwyżce wynosi "+p1.getPrice()+" zł");
    }
}
