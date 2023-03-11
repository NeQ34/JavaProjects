package zadania;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj znak i liczbę linii:");
        char znak = s.next().charAt(0);
        int linie = s.nextInt();
//        for(int i=0; i<linie; i++){
//            System.out.print(znak+""+znak);
//            for(int j=0; j<linie; j++){
//                System.out.print(" ");
//            }
//            System.out.print(znak+""+znak);
//            System.out.println();
//        }
        for(int i=0; i<linie; i++){
            for(int j=0; j<linie; j++){
                if(j<2 || j>linie-3){System.out.print(znak);}
                else {System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
