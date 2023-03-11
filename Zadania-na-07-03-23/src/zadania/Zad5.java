package zadania;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        float suma=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj ilość liczb:");

        int iloscLiczb = s.nextInt();
        for(int i=1; i<=iloscLiczb; i++){
            System.out.print(i+" liczba: ");int liczba = s.nextInt();
            suma+=liczba;
        }
        float srednia = suma/iloscLiczb;
        System.out.println("średnia liczb wynosi: "+srednia);
    }
}
