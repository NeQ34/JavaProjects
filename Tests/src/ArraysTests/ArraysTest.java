package ArraysTests;

import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest {
    public static void main(String[] args) {
        int[] liczby = {4,5,6};
        int[] kopia_liczby = liczby;
        for(int i : liczby){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(kopia_liczby));

//        int ilosc;
//        int a;
//        Scanner s = new Scanner(System.in);
//        do{
//            System.out.println("Podaj ilosc obiektow typu kwadrat:");
//            ilosc = s.nextInt();
//        }while(ilosc<0);
//        Kwadrat[] kwadraty = new Kwadrat[ilosc];
//        for(int i=0; i<kwadraty.length; i++){
//            do{
//                System.out.print("Podaj parametr "+(i+1)+" kwadratu:");a=s.nextInt();
//            }while(a<0);
//            kwadraty[i] = new Kwadrat(a);
//        }
//        for(Kwadrat k :kwadraty){
//            System.out.println(k);
//        }

//        int tabela[][] = new int[3][4];
//        for(int i=0; i<3; i++){
//            for(int x=0; x<4; x++){
//                tabela[i][x] = (i*4)+x+1;
//                System.out.println("["+i+"]"+"["+x+"]"+" = "+tabela[i][x]+" ");
//            }
//            System.out.println();
//        }
        String imiona[][] = {
                {"Jan","Mati","Tomek","Michal"},
                {"Patrycja","Ala","Ola","Ewa"}
        };
        System.out.println(imiona[1][1]);

        int arr[][] = new int[2][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = j;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        char kolkoIkrzyzyk[][] = {
                {'X','X','O'},
                {'X','O','X'},
                {'O','X','X'}
        };
        for(int i=0; i<kolkoIkrzyzyk.length; i++){
            for(int j=0; j<kolkoIkrzyzyk[i].length; j++){
                System.out.print(kolkoIkrzyzyk[i][j]+" ");
            }
            System.out.println();
        }

        int example[][] = {
                {4},
                {4,2,7,8},
                {3,1},
                {4,2,1,6,8,6,4,7}
        };
        for(int i=0; i<example.length; i++){
            for(int j=0; j<example[i].length; j++){
            }
            System.out.println("Dlugosc "+i+" rzedu: "+example[i].length);
        }
    }
}
