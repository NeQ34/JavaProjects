package zadania;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        float a,b,wynik;
        char o;
        String o2;
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbę a:");a = s.nextFloat();
        System.out.print("Podaj znak operacji (+ - * /)");o = s.next().charAt(0); //do wprowadzenia znakow
        //2 wersja: System.out.print("Podaj znak operacji (+ - * /)");o2 = s.next();
        System.out.print("Podaj drugą liczbę b:");b = s.nextFloat();

        wynik = switch(o){
            case '+'->{yield a+b;}
            case '-'->{yield a-b;}
            case '*'->{yield a*b;}
            case '/'->{yield a/b;}
            default -> {System.out.println("Nieznana operacja");yield 0;}
        };
        //2 wersja:
//        wynik = switch(o2){
//            case "+"->{yield a+b;}
//            case "-"->{yield a-b;}
//            case "*"->{yield a*b;}
//            case "/"->{yield a/b;}
//            default -> {System.out.println("Nieznana operacja");yield 0;}
//        };
        System.out.println("Wynik: "+wynik);

//        switch (o){
//            case '+':
//                System.out.println("a+b="+(a+b));
//                break;
//            case '-':
//                System.out.println("a-b="+(a-b));
//                break;
//            case '*':
//                System.out.println("a*b="+(a*b));
//                break;
//            case '/':
//                System.out.println("a/b="+(a/b));
//                break;
//            default:
//                System.out.println("Nieznana operacja");
//        }
    }
}
