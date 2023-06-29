package QuickSort;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        do{
            System.out.println("Podaj rozmiar tablicy: ");
            n = s.nextInt();
        }while(n<=0);

        int[] tab = new int[n];

        for(int i=0; i<tab.length; i++){
            System.out.println("Element "+(i+1)+":"); tab[i] = s.nextInt();
        }

//        System.out.println("Quicksort:");
//        printTab(tab);
//        quickSort(0,tab.length-1,tab);
//        System.out.println("Posortowana tablica:");
//        printTab(tab);

//        System.out.println("Bubble tab:");
//        printTab(tab);
//        bubbleSort(tab);
//        printTab(tab);

    }
    public static void quickSort(int l, int p, int[] tab){
        int i,j,pom;

        int x = tab[(l+p)/2];
        i=l;
        j=p;

        while(i<=j){
            while(tab[i]<x) i++;
            while(tab[j]>x) j--;

            if(i<=j){
                pom = tab[i];
                tab[i] = tab[j];
                tab[j] = pom;
                i++;
                j--;
            }
            if(l<j) {printTab(tab);quickSort(l,j,tab);}
            if(i<p) {printTab(tab);quickSort(i,p,tab);}
        }
    }
    public static void printTab(int[] tab){
        System.out.print("[");
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]);
            if(i<tab.length-1) System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void bubbleSort(int[] tab){
        for(int i=0; i<tab.length-1; i++){
            for(int j=0; j<tab.length-1-i; j++){
                if(tab[j]>tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
    }
}
