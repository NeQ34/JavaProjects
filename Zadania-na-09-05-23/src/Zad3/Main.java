package Zad3;

public class Main {
    public static double[] obliczsredniaWierszami(int[][] tab){
        double[] tabSrednie = new double[tab.length];
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                tabSrednie[i]+=tab[i][j];
            }
            //tu srednia xD
            tabSrednie[i]/=tab[i].length;
        }
        return tabSrednie;
    }
}
