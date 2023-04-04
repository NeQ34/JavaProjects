package Zadanie2;

public class Main {
    public static void main(String[] args) {
        Publication p1 = new Publication("Java. Przewodnik dla początkujących", "9788324639199", 79, 10);
        Publication p2 = new Publication("Java. Podstawy", "9788328357785", 99, 5);
        Publication p3 = new Publication("Java. Techniki zaawansowane", "9788328360662", 149, 2);
        Publication p4 = new Publication("Nature", "0028-0836", 95, 3);

        Publication[] tab = {p1,p2,p3,p4};
        ArrayOfPublicationsMethods.showPublications(tab);

        ArrayOfPublicationsMethods.showPublicationsTitles(tab);

        System.out.println("Calkowity dochod: "+ArrayOfPublicationsMethods.calculateTotalIncome(tab)+" zl");

        System.out.println("Publikacje <100zl: "+ArrayOfPublicationsMethods.countNumberOfCheaper(tab,100));

        System.out.println("Publikacje na wyczerpaniu: "+ArrayOfPublicationsMethods.countAlmostSoldOut(tab));
        System.out.println("Publikacje na wyczerpaniu tytuly: ");
        ArrayOfPublicationsMethods.printAlmostSoldOut(tab);

        System.out.println("Publikacja z id 9788328360662:\n"+ArrayOfPublicationsMethods.getPublicationsWithId(tab,"9788328360662"));

        ArrayOfPublicationsMethods.increasePricesByPercentage(tab,10);

        System.out.println("Czy istnieje Nature? "+ArrayOfPublicationsMethods.findTitleFirstIndex(tab,"Nature"));

        System.out.println("Calkowity koszt ksiazki 'Java. Przewodnik dla początkujących' wynosi: "+ArrayOfPublicationsMethods.calculateTotalPriceTitle(tab,"Java. Przewodnik dla początkujących")+" zl");
    }
}
