package zadanie1;

public class Main {
    public static void main(String[] args) {
        System.out.println(dzienTygodnia(DniTygodnia.PN));
        System.out.println(DniTygodnia.PN);

        for(DniTygodnia d : DniTygodnia.values()){
            System.out.println(dzienTygodnia(d));
        }
    }
    public static String dzienTygodnia(DniTygodnia d){
        return switch(d){
          case ND -> "Niedziela";
          case PN -> "Poniedzialek";
          case WT -> "Wtorek";
          case SR -> "Sroda";
          case CZW -> "Czwartek";
          case PT -> "Piatek";
          case SO -> "Sobota";
        };
    }
}
