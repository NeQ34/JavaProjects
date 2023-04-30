package Zad4;

public class Main {
    public static int[] obliczMinimaWierszami(int[][] tab){
        int[] minTab = new int[tab.length];
        for(int i=0; i<tab.length; i++){
            int min=tab[i][0];
            for(int j=0; j<tab[i].length; j++){
                if(tab[i][j]<min){
                    min=tab[i][j];
                }
            }
            minTab[i]+=min;
        }
        return minTab;
    }
}
