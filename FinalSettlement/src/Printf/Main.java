package Printf;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        double d = 11.56;
        System.out.printf("Sample text: %d%n",x);

        System.out.printf("Sample text: %.1f%n",d);//ilość liczb po ,

        System.out.printf("Sample text: %10.2f%n",d);//10 spacji w prawo i 2 liczby po ,
        System.out.printf("Sample text: %-10.2f%n",d);//10 spacji w prawo i 2 liczby po ,

        int[][] tab = {
                {4,5,3,2,6,7},
                {6,5,2,7,9,5},
                {0,8,5,2,4,7}
        };
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                System.out.printf("%5d",tab[i][j]);
            }
            System.out.println();
        }
        fun("a","b","c","d");
        String[] s = {"s","e","h"};
        fun(s);
        fun(new String[]{"a","b"});
    }
    public static void fun(String...s){
        System.out.println("XD");
    }
}
