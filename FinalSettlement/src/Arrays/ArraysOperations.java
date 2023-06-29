package Arrays;

public class ArraysOperations {
    //metoda zwracająca sumę danego wiersza:
    public static int[] sumaWierszami(int[][] tab){
        int[] sumaWierszami = new int[tab.length];
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                sumaWierszami[i]+=tab[i][j];
            }
        }
        return sumaWierszami;
    }
    //metoda zwracająca sumę kolumn
    public static int[] sumaKolumnami(int[][] tab){
        int[] sumaKolumami = new int[tab[0].length];
        for(int i=0; i<tab[0].length; i++){
            for(int j=0; j<tab.length; j++){
                sumaKolumami[i] += tab[j][i];
            }
        }
        return sumaKolumami;
    }
    //metoda zwracająca średnie poszczególnych wierszy:
    public static double[] srednieWierszami(int[][] tab){
        double[] srednie = new double[tab.length];
        double suma=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                suma+=tab[i][j];
            }
            srednie[i] = suma/tab[0].length;
            suma=0;
        }
        return srednie;
    }
    //metoda zwracająca średnie poszczególnych kolumn:
    public static double[] srednieKolumnami(int[][] tab){
        double[] srednie = new double[tab[0].length];
        double suma=0;
        for(int i=0; i<tab[0].length; i++){
            for(int j=0; j<tab.length; j++){
                suma+=tab[j][i];
            }
            srednie[i] = suma/tab.length;
            suma=0;
        }
        return srednie;
    }
    //metoda zwracająca główną przekątną tablicy:
    public static int[] przekatna(int[][] tab){
        int[] p = new int[tab.length];
        if(tab[0].length == tab.length) {
            for (int i = 0; i < tab.length; i++) {
                p[i] = tab[i][i];
            }
            return p;
        }else return null;
    }
    //metoda wyświetlająca drugą przekątną:
    public static int[] drugaPrzekatna(int[][] tab){
        int[] p2 = new int[tab.length];
        int x = tab.length;
        if(tab[0].length == tab.length) {
            for(int i=0; i<tab.length; i++){
                x--;
                p2[i] = tab[i][x];
            }
            return p2;
        }else return null;
    }
    //metoda zwracająca najmniejsze elementy z danego wiersza:
    public static int[] minElementWiersza(int[][] tab){
        int[] min = new int[tab.length];
        for(int i=0; i<tab.length; i++){
            int minElement = tab[i][0];
            for(int j=0; j<tab[i].length; j++){
                if(tab[i][j]<minElement){
                    minElement = tab[i][j];
                }
            }
            min[i] = minElement;
        }
        return min;
    }
    //metoda zwracająca tablice najmniejszych elementów w danej kolumnie:
    public static int[] minElementKolumnami(int[][] tab){
        int[] min = new int[tab[0].length];
        for(int i=0; i<tab[0].length; i++){
            int minElement = tab[0][i];
            for(int j=0; j<tab.length; j++){
                if(tab[j][i]<minElement){
                    minElement = tab[j][i];
                }
            }
            min[i] = minElement;
        }
        return min;
    }
    //metoda znajdująca największy element i jego pozycję w tablicy:
    public static ElementIPozycja maxElementIPozycja(int[][] tab){
        int max = tab[0][0];
        int x=0;
        int y=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                if(tab[i][j]>max){
                    max = tab[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        return new ElementIPozycja(max,x,y);
    }
    //metoda wyświetlająca tablicę 2d
    public static void displayArray(int[][] tab){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                System.out.printf("%5d",tab[i][j]);
            }
            System.out.println();
        }
    }
}
class ElementIPozycja{
    private int element;
    private int x;
    private int y;

    public ElementIPozycja(int element, int x, int y) {
        this.element = element;
        this.x = x;
        this.y = y;
    }
    public int getElement() {return element;}
    public int getX() {return x;}
    public int getY() {return y;}
}
