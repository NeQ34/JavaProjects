package zadania;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        //zadania na teams
        Scanner s = new Scanner(System.in);
        int punkty;
//        while(punkty<0 || punkty>18){
//            System.out.println("Błąd, podaj liczbę z przedziału [0,18]");
//            punkty = s.nextInt();
//        }
        //To samo tylko z do whilem:
        System.out.println("Podaj liczbę punktów z przedziału [0;18]:");
        do{
            punkty = s.nextInt();
            if(punkty<0 || punkty>18){System.out.println("Błąd, podaj liczbę z przedziału [0;18]");}
        }while(punkty<0 || punkty>18);
        int ocena;
//        switch(punkty){
//            case 17,18:
//                ocena=5;
//                break;
//            case 14,15,16:
//                ocena=4;
//                break;
//            case 11,12,13:
//                ocena=3;
//                break;
//            default:
//                ocena=2;
//                break;
//        }
        //switch expression
//        ocena = switch (punkty){
//            case 17,18:
//                yield 5;
//            case 14,15,16:
//                yield 4;
//            case 11,12,13:
//                yield 3;
//            default:
//                yield 2;
//        };
        //switch expression2 - ladniejsze zapisanie
        ocena = switch (punkty){
            case 17,18->{
                System.out.println("Ocena bdb");
                yield 5;
            }
            case 14,15,16->4;//mozna tez tak, to tylko przypisanie
            case 11,12,13->{yield 3;}
            default->{yield 2;}
        };
        s.close();
        System.out.println("Punkty: "+punkty+" Ocena: "+ocena);
    }
}
