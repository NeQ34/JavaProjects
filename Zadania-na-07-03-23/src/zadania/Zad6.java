package zadania;

public class Zad6 {
    public static void main(String[] args) {
        System.out.println("Suma1: "+suma(-56));
        System.out.println("Suma2: "+suma2(544));
    }

    public static int suma(int liczba) {
        if(liczba<0) liczba=Math.abs(liczba);
        int s=0,suma=0;
        while(liczba>0){
            s+=liczba%10;
            liczba/=10;
            //System.out.println(s);
            suma+=s;
            s=0;
        }
        return suma;
    }
    public static int suma2(int liczba){
        if(liczba<0) liczba=Math.abs(liczba);
        int s=0,suma=0;
        for(int i=liczba; i>0; i/=10){
            s+=i%10;
            //System.out.println(s);
            suma+=s;
            s=0;
        }
        return suma;
    }
}
