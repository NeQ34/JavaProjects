package Zad1_2_3;

public class Main {
    public static void main(String[] args) {
        //1:
        //wersja iteracyjna
        System.out.println("Potęga iteracyjna: "+potegaIt(5,3));
        System.out.println("Silnia: "+silniaR(-5));
        System.out.println("1) 5^3(rekurencyjnie): "+obliczPotege(5,3));
        System.out.println("2) 10^(-3)(rekurencyjnie): "+obliczPotegeCalk(10,-3));
        System.out.println("4) Suma cyfr iteracyjnie: "+sumaCyfrIteracyjnie(123));
        System.out.println("4) Suma cyfr rekurencyjnie: "+sumaCyfrRekurencyjnie(123));
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
    //zad 1 wersja rekurencyjna:
    public static int obliczPotege(int x, int n){
        if(n==0) return 1;
        else if(n>0) return x*obliczPotege(x,n-1);
        else return 0;
    }
    //2:
    public static double obliczPotegeCalk(double x, int n){
        if(n==0) return 1;
        else if(n>0) return x*obliczPotegeCalk(x,n-1);
        else return 1/obliczPotegeCalk(x,-n);//n<0 x^(-n) = 1/x^n
    }
    //zad 4: suma cyfr liczby
    public static int sumaCyfrIteracyjnie(int x){
        int suma=0;
        x = Math.abs(x);
        while(x>0){
            suma+=x%10;
            x/=10;
        }
        return suma;
    }
    public static int sumaCyfrRekurencyjnie(int x){
        x = Math.abs(x);
        if(x<10) return x;
        return x%10+sumaCyfrRekurencyjnie(x/10);
    }
}
