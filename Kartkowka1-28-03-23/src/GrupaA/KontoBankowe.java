package GrupaA;

public class KontoBankowe {
    private String wlasciciel;
    private String numerRachunku;
    private double stanKonta;

    public KontoBankowe(String wlasciciel, String numerRachunku, double stanKonta) {
        this.wlasciciel = wlasciciel;
        this.numerRachunku = numerRachunku;
        this.stanKonta = stanKonta;
    }
    //gettery:
    public String getWlasciciel() {
        return wlasciciel;
    }
    public String getNumerRachunku() {
        return numerRachunku;
    }
    public double getStanKonta() {
        return stanKonta;
    }
    //metody:
    public void wplata(double kwota){
        if(kwota>0) this.stanKonta+=kwota;
    }
    public boolean wyplata(double kwota){
        if(kwota<this.stanKonta) {
            this.stanKonta-=kwota;
            return true;
        }else return false;
    }
    public void wyswietl(){
        System.out.println("Numer rachunku: "+numerRachunku+"\nStan konta: "+stanKonta);
    }
    @Override
    public String toString() {
        return "Informacje o koncie"+
                "\nWlasciciel: " + wlasciciel +
                "\nNumerRachunku: " + numerRachunku +
                "\nStanKonta: " + stanKonta;
    }
}
