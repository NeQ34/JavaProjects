package zadania;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int l = s.nextInt();

        int potega=0,t=0,suma=0;

        for(int i=l; i>0; i/=10){potega++;}

        while(l>0){
            t+=l%10;
            l/=10;
            suma+=t*=Math.pow(10,--potega);
            t=0;
        }
        System.out.println("Odwrócona liczba: "+suma);
    }
}
