package zadanie1v2;

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
        wyswietlTablice(zamienWierszami(tab));
    }
    public static int[][] zamienWierszami(int[][] tab){
        int suma=0;
        int[] sumaKolumn = new int[tab[0].length];
        for(int i=0; i<tab[0].length; i++){
            for(int j=0; j<tab.length; j++){
                suma+=tab[j][i];
            }
            sumaKolumn[i] = suma;
            suma=0;
        }
        System.out.println("Suma kolumn: "+Arrays.toString(sumaKolumn));

        int min=sumaKolumn[0];
        int idMinKolumny = 0;
        for(int i=0; i<sumaKolumn.length; i++){
            if(sumaKolumn[i]<min){
                min = sumaKolumn[i];
                idMinKolumny = i;
            }
        }

        System.out.println("Kolumna z najmniejsza suma: "+idMinKolumny);

        for(int i=0; i<tab.length; i++){
            if(idMinKolumny!=0){
                int temp = tab[i][0];
                tab[i][0] = tab[i][idMinKolumny];
                tab[i][idMinKolumny] = temp;
            }else{
                int temp = tab[i][0];
                tab[i][0] = tab[i][tab[0].length-1];
                tab[i][tab[0].length-1] = temp;
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
