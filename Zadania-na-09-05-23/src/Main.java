import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.format("Liczba pi: %f%n",pi);
        System.out.printf("Liczba pi: %f%n",pi);//to samo

        double e = Math.E;
        System.out.format("Liczba pi: %f liczba e = %f%n",pi,e);

        System.out.printf("Liczba pi: %.3f%n",pi);//3 znaki po ,
        System.out.printf("Liczba pi: %10.3f%n",pi);//puste spacje do prawej xD
        System.out.printf("Liczba pi: %-10.3f%n",pi);//puste spacje do lewej xD

        System.out.printf(Locale.ROOT,"%.4f%n",pi);//lokalnie czy . czy , xD
    }
}
