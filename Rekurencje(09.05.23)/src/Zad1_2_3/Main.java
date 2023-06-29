package Zad1_2_3;

public class Main {
    public static void main(String[] args) {
        //1:
        //wersja iteracyjna
        System.out.println("Potęga iteracyjna: "+potegaIt(5,3));
        System.out.println("Silnia: "+silniaR(-5));
    }
    public static int potegaIt(int x, int n){
        int wynik=1;
        for(int i=1; i<=n; i++){
            wynik*=x;
        }
        return wynik;
    }
    //3
    public static int silniaR(int n){
        //warunek bazowy
        if(n==0) return 1;
        else if(n>1) return n*silniaR(n-1);
        else return n*silniaR(n+1);
    }
}
