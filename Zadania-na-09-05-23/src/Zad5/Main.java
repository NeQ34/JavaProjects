package Zad5;

import java.util.Arrays;

public class Main {
    public static int wyznaczIndeksWierszaZMinSuma(int[][] tab){
        int minWiersze[] = new int[tab.length];
        int suma=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                suma+=tab[i][j];
            }
            minWiersze[i] = suma;
            suma=0;
        }
        System.out.println(Arrays.toString(minWiersze));
        int index=0;
        int wMin=minWiersze[0];
        for(int i=0; i<minWiersze.length; i++){
            if(minWiersze[i]<wMin){
                wMin=minWiersze[i];
                index = i;
            }
        }
        return index;
    }
}
