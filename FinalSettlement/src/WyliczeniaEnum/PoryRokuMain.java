package WyliczeniaEnum;

import java.util.Scanner;

public class PoryRokuMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj nazwe miesiąca:");
        String miesiac = s.nextLine();

        PoryRoku pr = PoryRoku.valueOf(miesiac.toUpperCase());
        System.out.println(miesiac+" opis: "+pr.getOpis()+" trwa: "+pr.getIleTrwa());

        for(PoryRoku p : PoryRoku.values()){
            System.out.println(p+" trwa: "+p.getIleTrwa()+" opis: "+p.getOpis());
        }
    }
}
