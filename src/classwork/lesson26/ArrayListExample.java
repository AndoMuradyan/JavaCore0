package classwork.lesson26;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
//        arrayListy-masiv e
//        linkidListy-obekt e

        List<User> users = new ArrayList<>();
        System.out.println("size: " + users.size());
        System.out.println(users);
        System.out.println("------------------------------");
        users.add(new User("poxos", "poxosya", "poxos@mail.com", "poxos"));
        users.add(new User("petros", "petrosyan", "petros@mail.com", "petros"));
        users.add(new User("martiros", "martirosyan", "martiros@mail.com", "martiros"));

        System.out.println("size: " + users.size());
        System.out.println(users);
        System.out.println("-------------------------------");
//      users.add(indexov)- ays metody tvac indexsum kavelacne indexy tak yngacy ktexapoxe aj
//      users.set(indexov)-ays metody trvac indexy kjnje vren nory kavelacne
//        users.add(1,new User("dd","ds","dds","sd"));
//        System.out.println("size: " + users.size());
//        System.out.println(users);
//        users.set(1,new User("dd","ds","dds","sd"));
//        System.out.println("size: " + users.size());
//        System.out.println(users);


//        stugumy contains i eqoulsov e tpume e true kam false trvac dashty ka te chka
        boolean contains = users.contains(new User("martiros", "martirosyan", "martiros@mail.com", "martiros"));
        System.out.println("contains:- " + contains);
        System.out.println("--------------------------------");
//        ka erku tarberak indexov ev trvac obektov indexovy aveli arak kjnje isk obektovy hertom eqouls kene nor kjnje
        boolean remove = users.remove(new User("martiros", "martirosyan", "martiros@mail.com", "martiros"));
        System.out.println(users);
        System.out.println("size:- " + users.size());
        System.out.println("remove:- " + remove);
        System.out.println("----------------------------------");

        if (users != null && !users.isEmpty()) {
            User user = users.get(0);
            System.out.println("get:-" + user);
            System.out.println("------------------------------");
        }
    }
}
