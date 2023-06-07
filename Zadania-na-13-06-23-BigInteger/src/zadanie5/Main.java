package zadanie5;

public class Main {
    public static void main(String[] args) {
        long a = Long.MAX_VALUE;
        long b = Long.MAX_VALUE;

        System.out.println("a:"+a);
        System.out.println("b:"+b);

        long suma = a+b;
        System.out.println("suma: "+suma);

        long roznica = a-b;
        System.out.println("roznica: "+roznica);

        long iloczyn = a*b;
        System.out.println("iloczyn: "+iloczyn);

        long iloran = a/b;
        System.out.println("iloraz: "+iloran);

        long potega = (long) Math.pow(a,12);
        System.out.println("a^12: "+potega);

        long wBezwz = Math.abs(a);
        System.out.println("suma: "+wBezwz);

        //wyniki:
//        a:9223372036854775807
//        b:9223372036854775807
//        suma: -2
//        roznica: 0
//        iloczyn: 1
//        iloraz: 1
//        a^12: 9223372036854775807
//        suma: 9223372036854775807
    }
}
