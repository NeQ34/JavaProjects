import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static Zad1.Main.wyswietlTablice;
import static Zad2.Main.srednieKolumn;
import static Zad2.Main.srednieWierszami;
import static Zad3.Main.obliczsredniaWierszami;
import static Zad4.Main.obliczMinimaWierszami;
import static Zad5.Main.wyznaczIndeksWierszaZMinSuma;
import static Zad6.Main.wyznaczIndeksKolumnyMaxSuma;

public class Wyniki {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int n,m;
        do{
            System.out.print("Podaj liczbę wierszy:");
            n = s.nextInt();
            System.out.print("Podaj liczbę kolumn:");
            m = s.nextInt();
        }while(n<=0 || m<=0);
        int[][] tab = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                tab[i][j] = r.nextInt(11);
            }
        }
        wyswietlTablice(tab);
        System.out.println("2) Srednie wierszami: "+Arrays.toString(srednieWierszami(tab))+"\nSrednia kolumn: "+Arrays.toString(srednieKolumn(tab)));
        System.out.println("3) obliczSrednieWierszami: "+ Arrays.toString(obliczsredniaWierszami(tab)));
        System.out.println("4) obliczMinimaWierszami: "+Arrays.toString(obliczMinimaWierszami(tab)));
        System.out.println("5) wyznaczIndeksWierszaZMinSuma: "+wyznaczIndeksWierszaZMinSuma(tab));
        System.out.println("6) wyznaczIndeksKolumnyMaxSuma: "+wyznaczIndeksKolumnyMaxSuma(tab));
    }
}
