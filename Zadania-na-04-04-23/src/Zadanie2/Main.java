package Zadanie2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Publication p1 = new Publication("Lalka",001,28.99,3);//86,97 zl
        Publication p2 = new Publication("Zdolny do wszystkiego",002,49.99,5);//249,95 zl
        Publication p3 = new Publication("Pan Tadeusz",003,45.99,2);//91,98 zl

//        System.out.println(p1);
//        p1.raise(5);
//        p1.display();
//        p1.buy(4);
//        System.out.println(p1);

        //druga czesc zadania:
        Publication[] pubArray = {p1,p2,p3};
        ArrayOfPublicationsMethods.showPublications(pubArray);
        ArrayOfPublicationsMethods.showPublicationsTitles(pubArray);

        double dochod = ArrayOfPublicationsMethods.calculateTotalIncome(pubArray);
        System.out.println("Dochod ze sprzedazy wynosi: "+dochod+" zl");

        int tanszeKsiazki = ArrayOfPublicationsMethods.countNumberOfCheaper(pubArray,47.0);
        System.out.println("Ilosc tanszych ksiazek: "+tanszeKsiazki);

        int naWyczerpaniu = ArrayOfPublicationsMethods.countAlmostSoldOut(pubArray);
        System.out.println("Ilosc publikacji na wyczerpaniu: "+naWyczerpaniu);

        System.out.println("Obecne publikacje na wyczerpaniu to: ");
        ArrayOfPublicationsMethods.printAlmostSoldOut(pubArray);

        System.out.println("Szukana publikacja to:");
        System.out.println(ArrayOfPublicationsMethods.getPublicationsWithId(pubArray,002));

        Publication[] pubArray2 = {p1,p2,p3,p2,p3,p1};

        int firstIndex = ArrayOfPublicationsMethods.findTitleFirstIndex(pubArray2, "Zdolny do wszystkiego");
        System.out.println("Index pierwszej ksiazki to: "+firstIndex);

        int lastIndex = ArrayOfPublicationsMethods.findTitleLastIndex(pubArray2, "Pan Tadeusz");
        System.out.println("Index ostatniej ksiazki to: "+lastIndex);

        String[] titles = ArrayOfPublicationsMethods.getArrayOfTitles(pubArray);
        System.out.println("Tablica tytulow: "+Arrays.toString(titles));

        ArrayOfPublicationsMethods.increasePricesByPercentage(pubArray, 25);

        double cena = ArrayOfPublicationsMethods.calculateTotalPriceTitle(pubArray,"Lalka");
        System.out.println("Calkowity koszt ksiazki to: "+cena+" zl");
    }
}
