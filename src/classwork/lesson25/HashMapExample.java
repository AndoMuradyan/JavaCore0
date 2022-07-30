package classwork.lesson25;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
//        map i jamanak add metodi pexy putn e (avelacnel)

        Map<Integer, String> names = new HashMap<>();
//  valuen kra krknvi bayc key ery chen kra krknvi orinak
//        ete tanq 111 "poxos" chi dne bayc ete dneneq 444 "poxos kavelacne"
        names.put(111, "poxos");
        names.put(222, "petros");
        names.put(333, "martiros");
        names.put(444,"poxos");
//     kveradarcne stringy
//        replance kpoxe
        String value = names.get(333);
        System.out.println(value);
//    valuesy naxatesvac e vorpesi iterov franq mer elementneri vray
//        <stringov> anunneri vra
        Collection<String> values = names.values();
        for (String s : values) {
            System.out.println(s);
        }
        Set<Integer> integers = names.keySet();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
//       hashingi algoritmov puti jamanak  vercneqy hash kody ev kene kapasiti het bayc misht erkarutyun -1
    }
}
