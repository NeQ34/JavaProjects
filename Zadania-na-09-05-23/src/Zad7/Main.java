package Zad7;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] matrix = new int[5][5];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                int a = r.nextInt(10-(-5))-5;
                matrix[i][j] = a;
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.printf("%5d",matrix[i][j]);
            }
            System.out.println("");
        }

        System.out.println("c) minima kolmnami:"+Arrays.toString(minKolumn(matrix)));
        System.out.println("d) maksima kolumnami: "+Arrays.toString(maxKolumn(matrix)));

    }
    public static int[] minKolumn(int[][] tab){
        int[] minK = new int[tab[0].length];
        for(int i=0; i<tab[0].length; i++){
            int min=tab[0][i];
            for(int j=0; j<tab.length; j++){
                if(tab[j][i]<min){
                    min = tab[j][i];
                }
            }
            minK[i]=min;
        }
        return minK;
    }
    public static int[] maxKolumn(int[][] tab){
        int[] maxK = new int[tab[0].length];
        for(int i=0; i<tab[0].length; i++){
            int max=tab[0][i];
            for(int j=0; j<tab.length; j++){
                if(tab[j][i]>max){
                    max = tab[j][i];
                }
            }
            maxK[i]=max;
        }
        return maxK;
    }
}
