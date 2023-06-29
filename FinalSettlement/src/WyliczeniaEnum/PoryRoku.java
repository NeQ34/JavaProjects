package WyliczeniaEnum;

public enum PoryRoku {
    ZIMA("Pada śnieg",5),
    WIOSNA("Wszystko kwitnie",2),
    LATO("Wakacje",3),
    JESIEŃ("Pada deszcz",2);

    private String opis;
    private int ileTrwa;

    PoryRoku(String opis, int ileTrwa){
        this.opis = opis;
        this.ileTrwa = ileTrwa;
    }

    public String getOpis(){return opis;}
    public int getIleTrwa(){return ileTrwa;}
}
