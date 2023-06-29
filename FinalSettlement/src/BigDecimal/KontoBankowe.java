package BigDecimal;

import java.math.BigDecimal;

public class KontoBankowe {
    private BigDecimal saldo;
    private String name;
    private String numerKonta;

    KontoBankowe(String name, String numerKonta, BigDecimal saldo){
        this.name = name;
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {return saldo;}
    public String getName() {return name;}
    public String getNumerKonta() {return numerKonta;}

    public void dodajHajs(BigDecimal kwota){
        saldo = saldo.add(kwota);
        System.out.println("Pomyślnie wpłaciłeś "+kwota+"$");
        System.out.println("Stan konta po wpłacie wynosi: "+getSaldo());
    }
    public void wyplac(BigDecimal kwota){
        if(kwota.compareTo(saldo)>0){System.out.println("Nie masz tyle hajsu do wypłacenia");}
        else {
            saldo = saldo.subtract(kwota);
            System.out.println("Wypłaciłeś "+kwota+" z konta\nNa koncie pozostało: "+getSaldo()+"$");
        }
    }
    public void info(){
        System.out.println("Imie: "+getName()+"$");
        System.out.println("Numer konta: "+getNumerKonta()+"$");
        System.out.println("Saldo: "+getSaldo()+"$");
    }
}
