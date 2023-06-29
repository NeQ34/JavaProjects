package Zad7_11_13_14;

public class Main {
    public static void main(String[] args) {
        System.out.println("Czy jest 9: "+dziewiatka(8451));
        System.out.println("Czy jest 9: "+dziewiatka(8945));
        wyswietl(8,2);//7(10) na dwójkowy
        System.out.println("\n13) ciąg: "+ciag(5));
    }
    //7:
    public static boolean dziewiatka(int x){
        if(x<9) return false;
        else if(x==9 || x%10==9) return true;
        else return dziewiatka(x/10);
    }
    //11:
    public static void wyswietl(int n, int p){
        if(n<p) System.out.print(n);
        else{
            wyswietl(n/p,p);
            System.out.print(n%p);
        }
    }
    //13:
    public static int ciag(int n){
        if(n==0) return 2;
        else if(n==1) return 1;
        else if(n>=2) return 2/(2+ciag(n-1)*ciag(n-2));
        else return -1;
    }
}
