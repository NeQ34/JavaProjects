package Chetni;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int n = s.nextInt();

        if(n<0) System.out.println("Pierwiastek z ujemnej liczby nie istnieje");
        else System.out.println("Pierwiastek z liczby"+n+" wynosi: "+(int)Math.sqrt(n));
    }
}
