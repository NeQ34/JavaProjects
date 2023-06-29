package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Podaj wymiary tablicy:");
        do{
            System.out.print("n:"); n= s.nextInt();
            System.out.print("m:"); m= s.nextInt();
        }while(n<=0 || m<=0);

        int[][] tab = new int[n][m];
        generateRandomNumberArray(tab);
        ArraysOperations.displayArray(tab);
        System.out.println("Suma wierszami: "+Arrays.toString(ArraysOperations.sumaWierszami(tab)));
        System.out.println("Suma kolumnami: "+Arrays.toString(ArraysOperations.sumaKolumnami(tab)));
        System.out.println("Przekątna: "+Arrays.toString(ArraysOperations.przekatna(tab)));
        System.out.println("Druga przekątna: "+Arrays.toString(ArraysOperations.drugaPrzekatna(tab)));

        ElementIPozycja maxElement = ArraysOperations.maxElementIPozycja(tab);
        System.out.println("Największy element to: "+maxElement.getElement()+" znajduje się na: ["+maxElement.getX()+" "+maxElement.getY()+"]");

        System.out.println("Najmniejsze elementy z danego wiersza: "+Arrays.toString(ArraysOperations.minElementWiersza(tab)));
        System.out.println("Najmniejsze elementy z danej kolumny: "+Arrays.toString(ArraysOperations.minElementKolumnami(tab)));

        System.out.println("Srednia wierszami: "+Arrays.toString(ArraysOperations.srednieWierszami(tab)));
        System.out.println("Srednia kolumnami: "+Arrays.toString(ArraysOperations.srednieKolumnami(tab)));
    }
    public static void generateRandomNumberArray(int[][] tab){
        Random r = new Random();
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                tab[i][j] = r.nextInt(11);
            }
        }
    }
}
