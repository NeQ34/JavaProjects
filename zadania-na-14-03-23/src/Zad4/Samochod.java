package Zad4;

public class Samochod {
    private final String marka,model;
    private String numerRejestracyjny;
    private final int rocznik;
    private int przebieg,spalanie,predkoscMaksymalna,predkoscAktualnia,pojemnoscZbiornika;
    private double stanPaliwa;
    public Samochod(String marka, String model, String numerRejestracyjny, int spalanie, int predkoscMaksymalna, int pojemnoscZbiornika, int rocznik) {
        this.marka = marka;
        this.model = model;
        this.numerRejestracyjny = numerRejestracyjny;
        this.spalanie = spalanie;
        this.predkoscMaksymalna = predkoscMaksymalna;
        this.pojemnoscZbiornika = pojemnoscZbiornika;
        this.rocznik=rocznik;
        this.predkoscAktualnia=0;
        this.stanPaliwa=0;
        this.przebieg=0;
    }

    //settery:
    public void setNumerRejestracyjny(String numerRejestracyjny) {this.numerRejestracyjny = numerRejestracyjny;}
    public void setPrzebieg(int przebieg) {this.przebieg = przebieg;}
    public void setSpalanaie(int spalanie) {this.spalanie = spalanie;}
    public void setPredkoscMaksymalna(int predkoscMaksymalna) {this.predkoscMaksymalna = predkoscMaksymalna;}
    public void setPredkoscAktualnia(int predkoscAktualnia) {this.predkoscAktualnia = predkoscAktualnia;}
    public void setPojemnoscZbiornika(int pojemnoscZbiornika) {this.pojemnoscZbiornika = pojemnoscZbiornika;}
    public void setStanPaliwa(int stanPaliwa) {this.stanPaliwa = stanPaliwa;}
    //gettery:
    public String getNumerRejestracyjny() {return numerRejestracyjny;}
    public int getPrzebieg() {return przebieg;}
    public int getSpalanie() {return spalanie;}
    public int getPredkoscMaksymalna() {return predkoscMaksymalna;}
    public int getPredkoscAktualnia() {return predkoscAktualnia;}
    public int getPojemnoscZbiornika() {return pojemnoscZbiornika;}
    public double getStanPaliwa() {return stanPaliwa;}
    //metody:
    public int zwrocWiek(){return 2023-this.rocznik;}
    public void zmienNrRej(String nowyNumer){this.numerRejestracyjny=nowyNumer;}
    public void przyspiesz(int predkosc){this.predkoscAktualnia+=predkosc;}
    public void zwolnij(int predkosc){this.predkoscAktualnia-=predkosc;}
    public void zatankuj(int ilosc){this.stanPaliwa+=ilosc;}
    public void zatankujDoPelna(){this.stanPaliwa=pojemnoscZbiornika;}
    public boolean czyPusty(){return stanPaliwa>0;}
    public boolean czyPelny(){return stanPaliwa==pojemnoscZbiornika;}
    public void zatrzymajSie(){this.predkoscAktualnia=0;}
    public void wykonajTuning(int predkosc){this.predkoscMaksymalna+=predkosc;}
    public void jedz(double km){
        this.przebieg+=km;
        this.stanPaliwa-=(this.spalanie*km)/100;
    }
    public boolean czyStarszy(Samochod s){return this.zwrocWiek()>s.zwrocWiek();}
    @Override
    public String toString() {
        return "======================================================="+"\n"
                +"Marka: "+marka+"\n"
                +"Model: "+model+"\n"
                +"Rocznik: "+rocznik+"\n"
                +"numerRejestracyjny: " + numerRejestracyjny+"\n"
                +"przebieg: " + przebieg+"km\n"
                +"spalanaie: " + spalanie+"/100km\n"
                +"predkoscMaksymalna: "+predkoscMaksymalna+"km/h\n"
                +"predkoscAktualnia: "+predkoscAktualnia+"km/h\n"
                +"rocznik: "+rocznik+"\n"
                +"pojemnoscZbiornika: "+pojemnoscZbiornika+"L\n"
                +"stanPaliwa: "+stanPaliwa+"L"+"\n"
                +"=====================================================";
    }
}
