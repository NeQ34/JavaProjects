package zadania;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj znak i liczbe lini:");
        char znak = s.next().charAt(0);
        int linie = s.nextInt();

        for(int i=0; i<linie; i++){
            for(int j=0; j<linie; j++){
                if(i<2 || i>linie-3){System.out.print(znak);}
                else if(j<2 || j>linie-3){System.out.print(znak);}
                else {System.out.print(" ");}
            }
            System.out.println();
        }
    }
}