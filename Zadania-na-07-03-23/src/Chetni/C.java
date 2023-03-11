package Chetni;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj dwie liczby:");
        int a = s.nextInt();
        int b = s.nextInt();
        if(a>b && a%2==0) System.out.println(a+" jest wieksza od "+b+" i jest parzysta");
        else if(a>b && a%2!=0) System.out.println(a+" jest wieksza od "+b+" i jest nieparzysta");
        else if(b>a && b%2==0) System.out.println(b+" jest wieksza od "+a+" i jest parzysta");
        else System.out.println(b+" jest wieksza od "+a+" i jest nieparzysta");
    }
}
