package zadania;

import java.util.Scanner;

public class Zad9b {
    public static void main(String[] args) {
        char z;int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj znak i liczbe linii:");
        z = s.next().charAt(0);n = s.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i<2 || i>n-3) System.out.print(z);
                else if(j<2 || j>n-3) System.out.print(z);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
