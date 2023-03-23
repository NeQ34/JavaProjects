package Zadania;

import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        int[] tab1 = {4,2,-1,5};
        int[] tab2 = {4,2,7,8};
        TabliceMetodyPomocnicze.wyswtetlTab(tab1);
        System.out.println();
        System.out.println("średnia: "+TabliceMetodyPomocnicze.obliczSrednia(tab1));

        int min = TabliceMetodyPomocnicze.znajdzMinOrazIndeks(tab1).getEkstremum();
        int indexMin = TabliceMetodyPomocnicze.znajdzMinOrazIndeks(tab1).getIndex();
        System.out.println("Min: "+min+" index: "+indexMin);

        int max = TabliceMetodyPomocnicze.znajdzMaksOrazIndeks(tab1).getEkstremum();
        int indexMax = TabliceMetodyPomocnicze.znajdzMaksOrazIndeks(tab1).getIndex();
        System.out.println("Max: "+max+" index: "+indexMax);

        int id = TabliceMetodyPomocnicze.znajdzIndeksElementu(tab1, 5);
        System.out.println("Szukana liczba znajduje się na "+id+" pozycji");

        System.out.println("Ilość wyzerowanych elemenów: "+TabliceMetodyPomocnicze.zerujParzyste(tab1));

        System.out.println("Kwadraty elementów tablicy: "+Arrays.toString(TabliceMetodyPomocnicze.zwrocTabliceKwadratow(tab2)));

        int dodatnie = TabliceMetodyPomocnicze.obliczIlePlusMinusZer(tab1).getDodatnie();
        int ujemne = TabliceMetodyPomocnicze.obliczIlePlusMinusZer(tab1).getUjemne();
        int zerowe = TabliceMetodyPomocnicze.obliczIlePlusMinusZer(tab1).getZerowe();
        System.out.println("Tab1: Dodatnie: "+dodatnie+" ujemne: "+ujemne+" zerowe: "+zerowe);
    }
}
