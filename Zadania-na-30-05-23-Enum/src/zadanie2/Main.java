package zadanie2;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPoraRoku(5));
    }
    public static PoryRoku getPoraRoku(int n){
        return switch(n){
            case 3,4,5 -> PoryRoku.WIOSNA;
            case 6,7,8 -> PoryRoku.LATO;
            case 9,10,11 -> PoryRoku.JESIEN;
            case 1,2,12 -> PoryRoku.ZIMA;
            default -> null;
        };
    }
}
