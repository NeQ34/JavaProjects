package Zad1;

public class Disc {
    private static double vat;
    private String model;
    private int capacity;
    private double netto;

    public Disc(){}
    public Disc(String model, int capacity, double netto) {
        this.model = model;
        this.capacity = capacity;
        this.netto = netto;
    }
    //settery:
    public void setModel(String model) {this.model = model;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public void setNetto(double netto) {this.netto = netto;}
    //gettery:
    public static double getVat() {return vat;}
    public String getModel() {return model;}
    public int getCapacity() {return capacity;}
    public double getNetto() {return netto;}
    //metody:
    public double getBruttoPrice(){
        double v = (vat/100)+1;
        return netto*v;
    }
    public static void setVat(double vat){Disc.vat=vat;}
    @Override
    public String toString() {
        return "Model: "+model+
                "\nPojemność: "+capacity+
                "\nVat: "+vat+
                "\nNetto: "+netto;
    }
}
