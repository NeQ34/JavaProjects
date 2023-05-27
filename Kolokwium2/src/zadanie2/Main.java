package zadanie2;

public class Main {
    public static void main(String[] args) {
        System.out.println(ciag(5));
        System.out.println(ciag(2));
        System.out.println(ciag(1));
        System.out.println(ciag(-4));
    }
    public static int ciag(int n){
        if(n==0) return 0;
        else if(n==1) return 0;
        else if(n==2) return 1;
        else if(n>=3) return 3*(ciag(n-1)+ciag(n-2))+ciag(n-3);
        else return -1;
    }
}
