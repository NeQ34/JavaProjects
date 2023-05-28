package zadanie7;

import static zadanie7.TypDokumentu.czyAktNotarialny;
import static zadanie7.TypDokumentu.wyswietlWartosciEnuma;

public class Main {
    public static void main(String[] args) {
        TypDokumentu td1 = TypDokumentu.FAKTURA;
        TypDokumentu td2 = TypDokumentu.UMOWA;
        TypDokumentu td3 = TypDokumentu.AKT_NOTARIALNY;
        TypDokumentu td4 = TypDokumentu.NOTA_KORYGUJACA;

        System.out.println(czyAktNotarialny(td1));
        System.out.println(czyAktNotarialny(td2));
        System.out.println(czyAktNotarialny(td3));
        System.out.println(czyAktNotarialny(td4));

        wyswietlWartosciEnuma();
    }
}
