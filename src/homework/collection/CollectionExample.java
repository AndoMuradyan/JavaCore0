package homework.collection;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        String[] strings = {"hello", "java", "2", "0", "2", "2"};
        List<String> stringList = arrayToList(strings);

        System.out.println(listToSet(stringList));
        System.out.println(removeById(stringList,0));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(10,25,55,1,8));
        System.out.println(listToLinkedList(linkedList));
        Collections.sort(linkedList);
        System.out.println(reverseNumbers(linkedList));
//        mecic poqr ksortavore
        linkedList.sort(Collections.reverseOrder());
        System.out.println(reverseNumbers(linkedList));

        printFirstFive(stringList);
        System.out.println("size: "+sizeOfList(stringList));
    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        return  Arrays.asList(values);
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
