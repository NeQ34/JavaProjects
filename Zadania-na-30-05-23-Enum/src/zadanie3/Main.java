package zadanie3;


public class Main {
    public static void main(String[] args) {
        System.out.println(kWiatru(KierWiatru.N));
        kWiatru2(KierWiatru.N);

        wyswietlKierunki();
    }
    public static String kWiatru(KierWiatru kw){
        return switch(kw){
            case N -> "Polnoc";
            case S -> "Poludnie";
            case E -> "Wschod";
            case W -> "Zachod";
            default -> null;
        };
    }
    public static void kWiatru2(KierWiatru kw){
        switch(kw){
            case N -> System.out.println("Polnoc");
            case S -> System.out.println("Poludnie");
            case E -> System.out.println("Wschod");
            case W -> System.out.println("Zachod");
        };
    }
    public static void wyswietlKierunki(){
        for(KierWiatru k : KierWiatru.values()){
            System.out.println(kWiatru(k));
        }
    }
}
