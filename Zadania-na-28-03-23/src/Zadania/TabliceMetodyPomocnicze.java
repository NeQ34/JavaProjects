package Zadania;

import java.util.Arrays;

public class TabliceMetodyPomocnicze {
    public static void wyswtetlTab(int[] tab){
        for(int i:tab) System.out.print(i+" ");
    }
    public static double obliczSrednia(int[] tab){
        double srednia=0;
        for(int i:tab) srednia+=i;
        return srednia/tab.length;
    }
    public static EkstremumOrazIndeks znajdzMinOrazIndeks(int[] tab){
        int min=tab[0],index=0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i]<min) {min=tab[i];index=i;}
        }
        return new EkstremumOrazIndeks(min,index);
    }
    public static EkstremumOrazIndeks znajdzMaksOrazIndeks(int[] tab){
        int max=tab[0],index=0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i]>max) {max=tab[i];index=i;}
        }
        return new EkstremumOrazIndeks(max, index);
    }
    public static int znajdzIndeksElementu(int[] tab, int n){
        for(int i=0; i<tab.length; i++){
            if(tab[i]==n) return i;
        }
        return -1;
    }
    public static Statystyka obliczIlePlusMinusZer(int[] tab){
        Statystyka s = new Statystyka();
        for(int i=0; i<tab.length; i++){
            if(tab[i]>0) s.zwiekszDodatnie();
            else if(tab[i]<0) s.zwiekszUjemne();
            else if(tab[i]==0) s.zwiekszZerowe();
        }
        return s;
    }
    public static int zerujParzyste(int[] tab){
        int l=0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]%2==0) {tab[i]=0; l++;}
        }
        System.out.println("Tablica po wyzerowaniu: "+ Arrays.toString(tab));
        return l;
    }
    public static int[] zwrocTabliceKwadratow(int[] tab){
        for(int i=0; i<tab.length; i++) tab[i] = tab[i]*tab[i];
        return tab;
    }
}
class EkstremumOrazIndeks{
    private int ekstremum;
    private int index;

    public EkstremumOrazIndeks(int ekstremum, int index) {
        this.ekstremum = ekstremum;
        this.index = index;
    }

    public int getEkstremum() {return ekstremum;}
    public int getIndex() {return index;}
}
class Statystyka{
    private int dodatnie;
    private int ujemne;
    private int zerowe;

    public Statystyka(){}

    public void zwiekszDodatnie(){dodatnie++;}
    public void zwiekszUjemne(){ujemne++;}
    public void zwiekszZerowe(){zerowe++;}

    public int getDodatnie() {return dodatnie;}
    public int getUjemne() {return ujemne;}
    public int getZerowe() {return zerowe;}

    @Override
    public String toString() {
        return "Dodatnie: "+dodatnie+
                "\nUjemne: "+ujemne+
                "\nZerowe: "+zerowe;
    }
}
