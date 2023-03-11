package zadania;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj znak:");
        char znak = s.next().charAt(0);
        System.out.println("Podaj wysokość i szerokość prostokąta:");
        a = s.nextInt();b = s.nextInt();

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(znak+" ");
            }
            System.out.println();
        }
    }
}
