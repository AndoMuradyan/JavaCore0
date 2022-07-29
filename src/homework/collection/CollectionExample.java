package homework.collection;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        String[] strings = {"hello", "java", "2", "0", "2", "2"};
        List<String> test = new ArrayList<>();
        System.out.println(arrayToList(strings));
        test.add("poxos");
        test.add("petros");
        test.add("hayk");
        test.add("aram");
        test.add("martiros");
        test.add("anna");
        test.add("karen");
        test.add("arsen");
        System.out.println(listToSet(test));
        System.out.println(removeById(test,0));
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(15);
        linkedList.add(1);
        linkedList.add(1554);
        System.out.println(listToLinkedList(linkedList));

        Collections.sort(linkedList);
        System.out.println(reverseNumbers(linkedList));
//        mecic poqr ksortavore
        linkedList.sort(Collections.reverseOrder());
        System.out.println(reverseNumbers(linkedList));

        printFirstFive(test);
        System.out.println("size: "+sizeOfList(test));
    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        return new ArrayList<>(List.of(values));
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        list.remove(index);
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        return new HashSet<>(list);
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        return linkedList;
        return new LinkedList<>(list);
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
//        ArrayList<Integer> sort = new ArrayList<>();
        return new LinkedList<>(list);
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
//        List<Integer> print = new LinkedList<>();
        for (int i = 0; i <= 5; i++) {
            System.out.print(list.get(i)+" ");
        }

            System.out.println();
    }
        // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
        static int sizeOfList(List<String> list){
            return list.size();
        }


}
