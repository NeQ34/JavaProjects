package zadanie1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int n=0;
        int m=0;

        do{
            System.out.print("Podaj n: "); n = s.nextInt();
            System.out.print("Podaj m: "); m = s.nextInt();
        }while(n<=0 || m<=0);

        int[][] tab = new int[n][m];

        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                tab[i][j] = r.nextInt(15-(-12))-12;
            }
        }

        wyswietlTablice(tab);
        System.out.println("Zamieniona tablica: ");
        int[][] zamienionaTablica = zamienWiersze(tab);
        wyswietlTablice(zamienionaTablica);
    }

    public static int[][] zamienWiersze(int[][] tab){
        //wyznaczenie sumy kazdego wiersza:
        int suma=0;
        int sumaWierszy[] = new int[tab.length];
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                suma+=tab[i][j];
            }
            sumaWierszy[i] = suma;
            suma=0;
        }
        //wyszukiwanie wiersza z najmniejsza suma:
        int min=sumaWierszy[0];
        int idMinWiersza=0;
        for(int i=0; i<sumaWierszy.length; i++){
            if(sumaWierszy[i]<min){
                min = sumaWierszy[i];
                idMinWiersza = i;
            }
        }

        System.out.println("Suma wierszy: "+Arrays.toString(sumaWierszy));
        System.out.println("Wiersz z najmniejsza suma: "+idMinWiersza);

        //zamiana wierszy:
        for(int i=0; i<tab[0].length; i++){
            if(idMinWiersza!=0){
                int temp = tab[0][i];
                tab[0][i] = tab[idMinWiersza][i];
                tab[idMinWiersza][i] = temp;
            }else{
                int temp2 = tab[0][i];
                tab[0][i] = tab[tab.length-1][i];
                tab[tab.length-1][i] = temp2;
            }
        }
        return tab;
    }
    public static void wyswietlTablice(int[][] tab){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                System.out.printf("%5d",tab[i][j]);
            }
            System.out.println();
        }
    }
}
