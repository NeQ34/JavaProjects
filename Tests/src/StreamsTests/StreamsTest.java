package StreamsTests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamsTest {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Ala","ma","mkota");
        int ileA = (int) lista.stream().filter(e->(e.contains("m"))).count();
        System.out.println("Ilosc m:"+ileA);

        IntStream.range(0,12).filter(a->a%2==0).forEach(System.out::println);
    }
}
