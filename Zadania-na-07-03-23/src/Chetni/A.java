package Chetni;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj rok:");
        int year = s.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){System.out.println(year+" rok jest przestepny");}
        else System.out.println(year+" rok nie jest przestepny");
    }
}
