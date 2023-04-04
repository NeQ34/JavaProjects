package Zadanie2;

public class ArrayOfPublicationsMethods {
    public static void showPublications(Publication[] publications){
        for(int i=0; i<publications.length; i++){
            publications[i].display();
        }
    }
    public static void showPublicationsTitles(Publication[] publications){
        for(int i=0; i<publications.length; i++){
            System.out.println(publications[i].getTitle());
        }
    }
    public static double calculateTotalIncome(Publication[] publications){
        double suma=0;
        for(int i=0; i<publications.length; i++){
            suma+=Math.round(publications[i].getPrice()*publications[i].getQuantity()*100.0)/100.0;
        }
        return suma;
    }
    public static int countNumberOfCheaper(Publication[] publications, double cena){
        int ilosc=0;
        for(int i=0; i<publications.length; i++){
            if(publications[i].getPrice()<cena) ilosc++;
        }
        return ilosc;
    }
    public static int countAlmostSoldOut(Publication[] publications){
        int naWyczerpaniu=0;
        for(int i=0; i<publications.length; i++){
            if(publications[i].getQuantity()<=3) naWyczerpaniu++;
        }
        return naWyczerpaniu;
    }
    public static void printAlmostSoldOut(Publication[] publications){
        for(int i=0; i<publications.length; i++){
            if(publications[i].getQuantity()<=3) System.out.println(publications[i].getTitle());
        }
    }
    public static Publication getPublicationsWithId(Publication[] publications, String id){
        for(int i=0; i<publications.length; i++){
            if(publications[i].getIdent().equals(id)){
                return publications[i];
            }
        }
        return null;
    }
    public static int findTitleFirstIndex(Publication[] publications, String title){
        int index;
        for(int i=0; i<=publications.length-1; i++){
            if(publications[i].getTitle().equals(title)) {
                index = i;
                return index;
            }
        }
        return -1;
    }
    public static int findTitleLastIndex(Publication[] publications, String title){
        int index;
        for(int i= publications.length-1; i>0; i--){
            if(publications[i].getTitle().equals(title)){
                index = i;
                return index;
            }
        }
        return -1;
    }
    public static String[] getArrayOfTitles(Publication[] publications){
        String[] titles = new String[publications.length];
        for(int i=0; i<publications.length; i++){
            titles[i] = publications[i].getTitle();
        }
        return titles;
    }
    public static void increasePricesByPercentage(Publication[] publications, double procent){
        for(int i=0; i<publications.length; i++){
            publications[i].raise(procent);
        }
    }
    public static double calculateTotalPriceTitle(Publication[] publications, String title){
        double cena=0;
        for(int i=0; i<publications.length; i++){
            if(publications[i].getTitle().equals(title)){
                cena += publications[i].getPrice()*publications[i].getQuantity();
            }
        }
        return cena;
    }
}
