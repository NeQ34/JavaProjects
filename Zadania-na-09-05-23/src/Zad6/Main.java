package Zad6;

import java.util.Arrays;

public class Main {
    public static int wyznaczIndeksKolumnyMaxSuma(int[][] tab){
        int tabK[] = new int[tab[0].length];
        int sumaK=0;
        for(int i=0; i<tab[0].length; i++){
            for(int j=0; j<tab.length; j++){
                sumaK+=tab[j][i];
            }
            tabK[i]+=sumaK;
            sumaK=0;
        }
        int index=0;
        int max = tabK[0];
        for(int i=0; i<tabK.length; i++){
            if(tabK[i]>max){
                max = tabK[i];
                index=i;
            }
        }
        System.out.println(Arrays.toString(tabK));
        return index;
    }
}
