package Zad2;

public class Prostokat {
    private double dlugosc,szerokosc;

    Prostokat(){}
    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }
    //settery:
    public void setDlugosc(double dlugosc) {this.dlugosc = dlugosc;}
    public void setSzerokosc(double szerokosc) {this.szerokosc = szerokosc;}
    //gettery:
    public double getDlugosc() {return dlugosc;}
    public double getSzerokosc() {return szerokosc;}
    //metody:
    public double pole(){return dlugosc*szerokosc;}
    public double obwod(){return (2*dlugosc)+(2*szerokosc);}
    public double przekatna(){return Math.sqrt((dlugosc*dlugosc)+(szerokosc*szerokosc));}
}
