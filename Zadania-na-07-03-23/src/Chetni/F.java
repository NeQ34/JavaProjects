package Chetni;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj 3 liczby:");
        float a = s.nextInt();float b = s.nextInt();float c = s.nextInt();
        float srednia = (float)((a+b+c)/3);

        if(a>b && a>c) System.out.println("Najwieksza liczba: "+a);
        else if(b>a && b>c) System.out.println("Najwieksza liczba: "+b);
        else System.out.println("Najwieksza liczba: "+c);

        System.out.println("Srednia liczb wynosi: "+srednia);
    }
}
