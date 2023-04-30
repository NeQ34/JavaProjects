package Zad2;

public class Main {
    public static double[] srednieWierszami(int[][] tab){
        double[] tabsrednie = new double[tab.length];
        double suma=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                suma+=tab[i][j];
            }
            tabsrednie[i]+=suma/tab[i].length;
            suma=0;
        }
        return tabsrednie;
    }
    public static double[] srednieKolumn(int[][] tab){
        double[] tabSrednia = new double[tab[0].length];
        double srednia =0;
        for(int i=0; i<tab[0].length; i++){
            for(int j=0; j<tab.length; j++){
                srednia+=tab[j][i];
            }
            tabSrednia[i]+=Math.round((srednia/tab.length)*100)/100.0;
            srednia=0;
        }
        return tabSrednia;
    }
}