public class TabPomoc {
    public static int znajdzIndex(int[] tab, int n){
        int id=0;
        for(int i=0; i<tab.length; i++) if(tab[i] == n) id=i;
        return id;
    }
    public static IdIEkstremum MaxPozycjaOrazIndex(int[] tab){
        int max=tab[0];
        int index=0;
        for(int i=0; i<tab.length; i++) if(tab[i]>max) {max=tab[i];index=i;}
        return new IdIEkstremum(index,max);
    }
    public static IdIEkstremum MinPozycjaOrazIndex(int[] tab){
        int min=tab[0];
        int index=0;
        for(int i=0; i<tab.length; i++) if(tab[i]<min) {min=tab[i];index=i;}
        return new IdIEkstremum(index,min);
    }
    public static void coDrugaWartosc(int[] tab){
        for(int i=0; i<tab.length; i++){
            if(i%2==0) System.out.println(tab[i]);
        }
    }
    public static char[] wielkieLitery(char[] tab){
        char[] wielkieZnaki = new char[tab.length];
        for(int i=0; i<tab.length; i++){
            wielkieZnaki[i] = Character.toUpperCase(tab[i]);
        }
        return wielkieZnaki;
    }
    public static ParzysteNieparzyste parzysteNieparzyste(int[] tab){
        int[] parzyste=new int[4];
        int[] nieparzyste=new int[4];
        int a=0,b=0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]%2==0) {parzyste[a]=tab[i];a++;}
            else {nieparzyste[b]=tab[i];b++;}
        }
        return new ParzysteNieparzyste(parzyste,nieparzyste);
    }
    public static int[] tablicaKwadratow(int[] tab){
        for(int i=0; i<tab.length; i++){tab[i] = tab[i]*tab[i];}
        return tab;
    }
}
class IdIEkstremum{
    private int id;
    private int pozycja;

    public IdIEkstremum(int id, int pozycja) {
        this.id = id;
        this.pozycja = pozycja;
    }
    public int getId() {return id;}
    public int getPozycja() {return pozycja;}
}
class ParzysteNieparzyste{
    private int[] parzyste;
    private int[] nieparzyste;

    public ParzysteNieparzyste(int[] parzyste, int[] nieparzyste) {
        this.parzyste = parzyste;
        this.nieparzyste = nieparzyste;
    }

    public int[] getParzyste() {return parzyste;}
    public int[] getNieparzyste() {return nieparzyste;}
}

