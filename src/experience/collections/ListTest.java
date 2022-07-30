package experience.collections;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
//        ՔՈՄԵՆՏՆԵՐԸ ՎԵՐԱԲԵՐՎՈՒՄ ԵՆ ԻՐԱՆՑԻՑ ՆԵՐՔԵՎ ԳՐԱՑ ԿՈԴԵՐԻՆ
//        COMMENTS REFER TO CODE WRITTEN BELOW IN IRANIAN
//        КОММЕНТАРИИ ОТНОСЯТСЯ К КОДЕКСУ, НАПИСАНОМУ НИЖЕ

        ArrayList<Integer> a = new ArrayList<>();
        a.add(45);
        a.add(4);
        a.add(45);
        a.add(1);
        a.add(45);
        System.out.println(a);
        a.add(0, 8);
        System.out.println(a);

        a.remove(1);
        System.out.println(a);
        a.remove(Integer.valueOf(45));
        System.out.println(a);
//        ԲՈԼՈՐ ԷԼԵՄԵՆՏՆԵՐԸ ԿՋՆՋԵ  a.clear();
//        WILL DELETE ALL ELEMENTS a.clear();
//        УДАЛИТ ВСЕ ЭЛЕМЕНТЫ      a.clear();
//        a.clear();
//        indexof gimananq mer tvac tivy vor indexov e sxal tiv talu depkum -1 kveradarcne
        System.out.println(a.indexOf(45));
//        ktpe indexsi taki tivy
        System.out.println(a.get(0));
//        ktpe elementneri qanak
//        ktpe kentery fory
        System.out.println(a.size());

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 1) {
                System.out.print(a.get(i) + " ");
            }

        }
        System.out.println();
//        contains kuta tru ete trvac tivy ka kutpe false ete chka
        System.out.println(a.contains(8));


        List<String> s = new ArrayList<>(Arrays.asList("trt", "s"));
        System.out.println(s);
// grenq kod vory ktpe 10hat 1
        List<Integer> n = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            n.add(1);
        }
        System.out.print(n);
//  es kodov kgrenq 10 hat 1 aranc fori
        List<Integer> nb = new ArrayList<>(Collections.nCopies(10, 1));
        System.out.println(nb);

// ays kodove kudanq erku hat tarber tver kkpcnenq nuyn masivi mej addAll ov
        List<Integer> nn = new ArrayList<>(Collections.nCopies(10, 1));
        List<Integer> nn2 = new ArrayList<>(Collections.nCopies(5, 2));
        nn.addAll(nn2);
        System.out.println(nn);


// sortavoregy poqric mec Collections.sort(anuny);
        ArrayList<Integer> sort = new ArrayList<>();
        sort.add(45);
        sort.add(4);
        sort.add(457);
        sort.add(1);
        sort.add(3);
        Collections.sort(sort);
        System.out.println(sort);
//        mecic poqr ksortavore
        Collections.sort(sort, Collections.reverseOrder());
        System.out.println(sort);


        List<String> names = new ArrayList<>();
        names.add("Hayk");
        names.add("Anna");
        names.add("Karen");
        names.add("Babken");
        System.out.println(names);
//        dasavorum e aybenakan tarerov sort
        Collections.sort(names);
        System.out.println(names);


        List<Humen> humens = new ArrayList<>();
        humens.add(new Humen("Hayk", 20,100));
        humens.add(new Humen("Anna", 30,200));
        humens.add(new Humen("Babken", 25,510));
        System.out.println(humens);
//   ays sortov menq sortavorum enq tarikov vochte anunnerov
//    erku sorty irar het meky poqric mec myusy mecic poqr

//classneer enq sarke qich kod grelu hamar (comparator)
        Collections.sort(humens, new AgeComparator());
        System.out.println("tarikov " + humens);
        Collections.sort(humens, new NameComparator());
        System.out.println("anunerov " + humens);

//        sortavorenq poqric mec ashxatavarcov bayc VELI LAVE SARKENQ AGE EV NAME NAMAN ARANCIN CA
        Collections.sort(humens, new Comparator<Humen>() {
            @Override
            public int compare(Humen o1, Humen o2) {
                return o1.getSalary()-o2.getSalary();
            }
        });
        System.out.println(humens);

//        classi mej impliment arac metody ays kodi hamer e
//        vorpezi menq karoxananq compareTo medody kanchenq u hamematenq erku humen irar het

//        Humen h1 = new Humen("A", 29);
//        Humen h2 = new Humen("B", 25);
//        System.out.println(h1.compareTo(h2));
    }
}
