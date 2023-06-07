package zadanie1;

import java.math.BigDecimal;

public class Produkt {
    private String nazwa;
    private BigDecimal cena;
    private int ilosc;
    private Kategoria kategoria;

    public Produkt(String nazwa, BigDecimal cena, int ilosc, Kategoria kategoria) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
        this.kategoria = kategoria;
    }

    public void setNazwa(String nazwa) {this.nazwa = nazwa;}
    public void setCena(BigDecimal cena) {this.cena = cena;}
    public void setIlosc(int ilosc) {this.ilosc = ilosc;}
    public void setKategoria(Kategoria kategoria) {this.kategoria = kategoria;}

    public String getNazwa() {return nazwa;}
    public BigDecimal getCena() {return cena;}
    public int getIlosc() {return ilosc;}
    public Kategoria getKategoria() {return kategoria;}

    public BigDecimal obliczCeneCalkowita(){
        return cena.multiply(BigDecimal.valueOf(ilosc));
    }

    @Override
    public String toString() {
        return "nazwa:" + nazwa
                +"\ncena: " + cena
                +"\nilosc: " + ilosc
                +"\nkategoria: " + kategoria;
    }
}
