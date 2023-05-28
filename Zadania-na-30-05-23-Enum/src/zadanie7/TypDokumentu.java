package zadanie7;

public enum TypDokumentu {
    FAKTURA, UMOWA, AKT_NOTARIALNY, NOTA_KORYGUJACA;

    public static boolean czyAktNotarialny(TypDokumentu typDokumentu){
        return typDokumentu == TypDokumentu.AKT_NOTARIALNY;
    }
    public static void wyswietlWartosciEnuma(){
        for(TypDokumentu td : TypDokumentu.values()){
            System.out.println(td);
        }
    }
}
