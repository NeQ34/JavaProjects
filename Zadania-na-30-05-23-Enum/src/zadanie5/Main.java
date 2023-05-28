package zadanie5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dt;
        System.out.println("Podaj dzien tygodnia:");
        dt = s.nextLine();
        try{
            DniTygodnia dt5 = DniTygodnia.valueOf(dt.toUpperCase());
            System.out.println(dt5.isWeekend() ? "EZ WEEKEND" : "Jeszcze musisz poczekac");
        }catch(Exception e){
            System.out.println("Bledny dzien tygodnia");
        }
    }
}
