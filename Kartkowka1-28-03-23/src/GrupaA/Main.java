package GrupaA;

public class Main {
    public static void main(String[] args) {
        KontoBankowe k1 = new KontoBankowe("Jan Piotrowski","70 1410 2006 0000 3200 0926 4671", 1000);
        System.out.println(k1);
        System.out.println(k1.wyplata(900));
        System.out.println(k1);
        k1.wplata(400);
        System.out.println(k1);
    }
}
