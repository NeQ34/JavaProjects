package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1,4,6,7,9};

//        int x = 9;
//        int index = wyszukiwanieLiniowe(tab,x);
//        if(index!=-1) System.out.println(x+" znajduje się w tablicy na pozycji "+index);
//        else System.out.println("Brak elementu "+x+" w tablicy");

        //binary search:
        //uwaga tablica musi być posortowana aby to działało
        int x = 7;
        int p = binarySearch(tab,x);

        if(p!=-1) System.out.println("W tablicy znajduje się element "+x+" na pozycji "+p);
        else System.out.println("Nie znaleziono elementu "+x+" w tablicy");
    }
    public static int wyszukiwanieLiniowe(int[] tab, int x){
        for(int i=0; i<tab.length; i++){
            if(tab[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] tab, int x){
        int l=0;
        int r = tab.length-1;
        int sr;
        while(l<=r){
            sr = l+(r-l)/2;
            if(x<tab[sr]){
                r = sr-1;
            }else if(x>tab[sr]){
                l = sr+1;
            }
            else return sr;
        }
        return -1;
    }
}
