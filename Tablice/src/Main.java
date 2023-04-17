import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = {1,8,-1,0};
        char[] litery = {'a','g','n','t','i'};
        String[] zdanie = {"Ala","ma","kota"};
        int szukana=4;
        int id = TabPomoc.znajdzIndex(tab1,szukana);
        System.out.println(szukana+" znajduje sie na "+id+" pozycji");

        int max = TabPomoc.MaxPozycjaOrazIndex(tab1).getPozycja();
        int idMax = TabPomoc.MaxPozycjaOrazIndex(tab1).getId();
        System.out.println("Maksymalna wartosc tablicy to: "+max+" znajduje sie na "+idMax+" pozycji");

        int min = TabPomoc.MinPozycjaOrazIndex(tab1).getPozycja();
        int idMin = TabPomoc.MinPozycjaOrazIndex(tab1).getId();
        System.out.println("Minimalna wartosc tablicy to: "+min+" znajduje sie na: "+idMin+" pozycji");

        //TabPomoc.coDrugaWartosc(tab1);
        //System.out.println(Arrays.toString(TabPomoc.wielkieLitery(litery)));

        int[] tab3 = {1,5,4,6,7,8,7,6};
        int[] parzyste = TabPomoc.parzysteNieparzyste(tab3).getParzyste();
        int[] nieparzyste = TabPomoc.parzysteNieparzyste(tab3).getNieparzyste();
        System.out.println(Arrays.toString(parzyste));
        System.out.println(Arrays.toString(nieparzyste));

        int[] tab4={3,6,4};
        int[] kwadraty= TabPomoc.tablicaKwadratow(tab4);
        System.out.println(Arrays.toString(kwadraty));
    }
}