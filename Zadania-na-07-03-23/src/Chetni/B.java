package Chetni;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int n = s.nextInt();
        //operator ternarny xD
        System.out.println(n%2==0 ? "Liczba jest parzysta" : "Liczba jest nieparzysta");
        if(n%2==0) System.out.println("Liczba jest parzysta");
        else System.out.println("Liczba jest nieparzysta");
    }
}
