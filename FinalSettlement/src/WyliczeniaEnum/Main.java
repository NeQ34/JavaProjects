package WyliczeniaEnum;

public class Main {
    public static void main(String[] args) {
        Transport tp = Transport.TIR;

        System.out.println(switch(tp){
            case AUTO -> "Auto przewozi pasażerów";
            case TIR -> "Tir przewozi towary";
            case KOLEJ -> "Kolej wymaga torów";
            case SAMOLOT -> "Samolot lata";
            case STATEK -> "Statek pływa po wodzie";}
        );

        wyswietlEnum();

        System.out.println("Prędkość samolotu wynosi: "+Transport.SAMOLOT.getSpeed()+"km/h");

        wyswKolor(Color.GREEN);
    }
    public static void wyswietlEnum(){
        System.out.println("Elementy enuma: ");
        Transport[] allEnumValues = Transport.values();
        for(Transport t : allEnumValues){
            System.out.println(t+"("+t.getSpeed()+"km/h)");
        }
    }
    static void wyswKolor(Color c){
        System.out.println(switch(c){
            case RED -> "czerwony";
            case GREEN -> "zielony";
            case BLUE -> "niebieski";
        });
    }
}
