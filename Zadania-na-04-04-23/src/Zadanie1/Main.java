package Zadanie1;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = {4,6,3,5,7,8,1};
        int ilePlus = nieParzyste(tab1);
        System.out.println("Liczba zamienionych elementów: "+ilePlus);

        int ilePar = ilePar(tab1);
        System.out.println("Liczba par: "+ilePar);
    }
    public static int nieParzyste(int[] tab){
        int ile=0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]%2!=0) {tab[i]+=1; ile++;}
        }
        return ile;
    }
    public static int ilePar(int[] tab){
        int ile=0;
        for(int i=0; i<tab.length-1; i++){
            if(tab[i]<tab[i+1]) ile++;
        }
        return ile;
    }
}
