package GrupaB;

public class KartaKredytowa {
    private String numerKarty;
    private double saldo;
    private double limitKredytu;

    public KartaKredytowa(String numerKarty, double saldo, double limitKredytu) {
        this.numerKarty = numerKarty;
        this.saldo = saldo;
        this.limitKredytu = limitKredytu;
    }
    //gettery:
    public String getNumerKarty() {
        return numerKarty;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimitKredytu() {
        return limitKredytu;
    }
    //metody:
    public boolean zaplac(double kwota){
        if(kwota<(this.limitKredytu-saldo)) {
            this.saldo+=kwota;
            return true;
        }else return false;
    }
    public void dokonajSplaty(int kwota){
        if(kwota>0) this.saldo-=kwota;
    }
    public void wyswietl(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Informacje o karcie kredytowej" +
                "\nNumer karty: " + numerKarty +
                "\nSaldo: " + saldo +
                "\nLimit kredytu: " + limitKredytu;
    }
}
