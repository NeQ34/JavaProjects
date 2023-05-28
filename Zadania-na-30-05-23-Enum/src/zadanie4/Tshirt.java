package zadanie4;

public class Tshirt {
    private static TshirtSize size;
    private static String producer;

    public Tshirt(TshirtSize size, String producer) {
        this.size = size;
        this.producer = producer;
    }

    public static void showTshirtDetails(){
        System.out.printf("Nazwa producenta: %s%nRozmiar: %s", producer,
                switch(size){
                    case S -> "Maly";
                    case M -> "Sredni";
                    case L -> "Duzy";
                    case XL -> "Bardzo duzy";
        });
    }
}
