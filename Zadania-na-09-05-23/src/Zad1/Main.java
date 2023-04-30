package Zad1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int n;
        do{
            System.out.println("Podaj rozmiar tablicy:");
            n = s.nextInt();
        }while(n<=0);
        int[][] tab = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                tab[i][j] = r.nextInt(11);
            }
        }
        wyswietlTablice(tab);
        //a:
        System.out.println("a:");
        System.out.println("Suma pierwszej przekatnej: "+obliczSumeLiczbPrzekatnych(tab));
        //w domu 2 przekątna
        System.out.println("PD Suma drugiej przekatnej: "+obliczSumeDrugiejPrzekatnej(tab));
        //b:
        System.out.println("b:");
        IndeksyMax im= najwiekszaWartosc(tab);
        System.out.println("Pierwsza najwieksza wartość znajduje się na: ["+im.getiMax()+"]["+im.getjMax()+"]");
        //c:
        System.out.println("c:");
        double srednia  = Math.round(obliczSrednia(tab)*100)/100.0;
        System.out.println("Średnia liczb: "+srednia);
        System.out.println("Ilość liczb > średniej wynosi: "+ileLiczbWiekszychOdSredniej(tab));
    }
    public static void wyswietlTablice(int[][] tab){
        for(int[] w:tab){
            for(int el:w){
                System.out.printf("%4d",el);
            }
            System.out.println("");
        }
    }
    public static int obliczSumeLiczbPrzekatnych(int[][] tab){
        int suma=0;
        for(int i=0; i<tab.length; i++){
            suma+=tab[i][i];
            System.out.print("["+tab[i][i]+"] ");
        }
        return suma;
    }
    public static int obliczSumeLiczbPrzekatnych(int[][][] tab){
        int suma=0;
        for(int i=0; i<tab.length; i++){
            suma+=tab[i][i][i];
            System.out.print(tab[i][i][i]+" ");
        }
        return suma;
    }
    public static int obliczSumeDrugiejPrzekatnej(int[][] tab){
        int suma=0;
        int xLength=tab.length-1;
        for(int i=0; i<tab.length; i++){
            System.out.print("["+tab[i][xLength]+"] ");
            suma+=tab[i][xLength--];
        }
        return suma;
    }
    public static IndeksyMax najwiekszaWartosc(int[][] tab){
        int najwieksza=tab[0][0];
        int indexI=0;
        int indexJ=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                if(tab[i][j]>najwieksza){
                    najwieksza = tab[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        return new IndeksyMax(indexI+1,indexJ+1);
    }
    public static double obliczSrednia(int[][] tab){
        double suma=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                suma+=tab[i][j];
            }
        }
        return suma/(tab.length*tab.length);
    }
    public static int ileLiczbWiekszychOdSredniej(int[][] tab){
        int ile=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                if(tab[i][j]>obliczSrednia(tab)){
                    ile++;
                }
            }
        }
        return ile;
    }
}
class IndeksyMax{
    int iMax;
    int jMax;
    public IndeksyMax(int iMax, int jMax) {
        this.iMax = iMax;
        this.jMax = jMax;
    }
    public int getiMax() {
        return iMax;
    }
    public int getjMax() {
        return jMax;
    }
}
