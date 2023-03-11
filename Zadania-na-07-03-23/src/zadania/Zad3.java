package zadania;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Zad3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj numer miesiąca:");
        int miesiac = s.nextInt();
//        YearMonth yearMonth = YearMonth.of(2023,miesiac);
//        int daysInMonth = yearMonth.lengthOfMonth();
//        System.out.println(miesiac +" miesiac ma "+daysInMonth+" dni");

//        Calendar cal = Calendar.getInstance();
//        int days = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
//
//        System.out.println(days);
        int liczbaDni;
        liczbaDni = switch(miesiac){
            case 2->28;
            case 4,6,9,11->30;
            case 1,3,5,7,8,10,12->31;
            default -> 0;
        };
        System.out.println(miesiac+" miesiąc ma "+liczbaDni+" dni");

    }
}
