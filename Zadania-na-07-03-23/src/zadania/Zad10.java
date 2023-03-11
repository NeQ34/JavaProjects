package zadania;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy:");
        int n = s.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                //System.out.println(i+"*"+j+"="+(i*j));
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
