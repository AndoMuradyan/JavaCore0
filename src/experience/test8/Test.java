package experience.test8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Musician pianist = new Musician() {
            @Override
            public void playMusic() {
                System.out.println("Playing piano");
            }
        };
        pianist.playMusic();
// ananimus iner class sarkum e get class fail
//        ays sarkac -> class lyamda greladzev ne ev vochmi get class chi sarkum ev aveli arag e
        Musician guitarist = () -> System.out.println("plaing guitar");

        guitarist.playMusic();

        Message sms = (text) ->
                System.out.println("Sending SMS " + text);


        sms.sendMassage("Hello");
//sout depkum pardadire bloknery bacel reaturni depkum yst cankutyan
        A z = (a, b) -> {
            return a + b;
        };
        System.out.println(z.sum(4, 6));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 9, 7, 1));
        for (Integer x : numbers) {
            System.out.print(x + " ");

        }
//        lambdayov mi toxov inchor bdi greynq forachov
        System.out.println();
        numbers.forEach(x -> System.out.print(x + " "));
        System.out.println();


        List<String> names = new ArrayList<>();
        names.add("hayk");
        names.add("anna");
        names.add("karen");
//        interfesy e-> stream.map();
//        Stream<String> stream = names.stream();
        List<String> r = names.stream()
                .filter(a -> a.length() <= 4)
//                erku grealadzev chisty comentne
//                .map(x->x.toUpperCase())
                .map(C::convert)
                .collect(Collectors.toList());

        System.out.println(r);

    }

//        List<String> r = new ArrayList<>();
//        for (String n : names) {
//            r.add(n.toUpperCase());
//
//        }
//        System.out.println(r);

}


