package Zad3;

public class Pracownik {
    //stawka - wynagrodzenie za 1h pracy | godz - l. godz w mies.
    String imie,nazwisko;
    double stawka,godz,premia;

    Pracownik(){}
    public Pracownik(String imie, String nazwisko, double stawka, double godz, double premia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawka = stawka;
        this.godz = godz;
        this.premia = premia;
    }
    //settery:
    public void setImie(String imie) {this.imie = imie;}
    public void setNazwisko(String nazwisko) {this.nazwisko = nazwisko;}
    public void setStawka(double stawka) {this.stawka = stawka;}
    public void setGodz(double godz) {this.godz = godz;}
    public void setPremia(double premia) {this.premia = premia;}
    //gettery:
    public String getImie() {return imie;}
    public String getNazwisko() {return nazwisko;}
    public double getStawka() {return stawka;}
    public double getGodz() {return godz;}
    public double getPremia() {return premia;}
    //metody:
    public double obliczPodstawoweWynagrodzenie(){return stawka*godz;}
    public double obliczPelneWynagrodzenie(){return obliczPodstawoweWynagrodzenie()+premia;}
    public void zmienPremia(double premia){this.premia=premia;}
    public void dajPodwyzke(double podwyzka){this.stawka+=podwyzka;}
    public boolean czyJestPremia(){return premia>0;}
    public boolean wiecejPracuje(Pracownik p){return this.godz>p.godz;}
    public void wyswietl(){
        System.out.println("===================================================");
        System.out.println("Imie i nazwisko: "+imie+" "+nazwisko+"\n"
                +"Podstawowe wynagrodzenie: "+obliczPodstawoweWynagrodzenie()+"\n"
                +"Pelne wynagrodzenie: "+obliczPelneWynagrodzenie()+"\n"
                +"premia: "+premia+"\n"
                +"stawka: "+stawka+"\n"
                +"godz: "+godz);
        System.out.println("===================================================");
    }
}
