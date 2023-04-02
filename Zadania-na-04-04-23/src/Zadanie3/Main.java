package Zadanie3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] losoweLiczby = new int[20];
        Random r = new Random();
        for (int i=0; i<losoweLiczby.length; i++) {
            losoweLiczby[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(losoweLiczby));
        int suma=0;
        for(int j=0; j<10; j++){
            for(int i=0; i<losoweLiczby.length; i++) {
                if(j==losoweLiczby[i]) {
                    suma++;
                }
            }
            System.out.println("Ilosc liczby "+j+" wynosi: "+suma);
            suma=0;
        }
    }
}
