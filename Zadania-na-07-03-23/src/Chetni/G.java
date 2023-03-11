package Chetni;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj przedzial (0;100]");
        float g = s.nextInt();

        if(g>40) System.out.println("Extra strong liquor");
        else if(g>20 && g<=40) System.out.println("Strong liquor");
        else if(g>15 && g<=20) System.out.println("Liquor");
        else if(g>12 && g<=15) System.out.println("Strong vine");
        else if(g>10.5 && g<=12) System.out.println("Normal vine");
        else System.out.println("Light vine");

    }
}
