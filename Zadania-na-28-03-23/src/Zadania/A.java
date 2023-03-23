package Zadania;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        do{
            System.out.println("Podaj ilość elementów tablicy:");
            n = s.nextInt();
        }while(n<=0);
        int[] tab = new int[n];
        for(int i=0; i<n; i++){System.out.print(i+1+" element: ");tab[i]=s.nextInt();}
        System.out.println("Elementy tablicy: "+Arrays.toString(tab));
        //c:
        double srednia = TabliceMetodyPomocnicze.obliczSrednia(tab);
        System.out.println("średnia: "+srednia+"\nElementy tablicy mniejsze od średniej:");
        for(int i:tab) if(i<srednia) System.out.print(i+" ");
    }
}
