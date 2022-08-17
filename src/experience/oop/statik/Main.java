package experience.oop.statik;

public class Main {
//
    public static void main(String[] args) {
//        Human h = new Human();
//        Human h2 = new Human();

        System.out.println(Human.count);
        System.out.println(Human.a);

        Student s1 = new Student("Hayk");
        s1.sum(4, 5);
        Student s2 = new Student("Anna");
        s2.sum(4, 5);

        Student.sum(4, 6);

//     parsInt stringi meji tivy tarcnum enq int ev a+1 aysinkn 7 in gumre 1  ev tpe
        String s = "7";
        int a = Integer.parseInt(s);
        System.out.println(a + 1);
//        ays kodov menq stukgum enq chari mej tvacy tiv e te Tar ete Tare tpum e tru ete tiv tpum e fALSE
//        Character.isLetter sranov
//        ays bolory static funkacianer e
        char c = 'A';
        boolean letter = Character.isLetter(c);
        System.out.println(letter);
//        ays kodov menq stugum enq trvac stringum qani  hat mecatar ka
        String pass ="asd as456845A6 Asde";
        int count =0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
//        ays kody integeri maximal tivne tpum sa irenic nerkayacnum e pablic static fainl
//        max tiv 2147483647
//
        System.out.println(Integer.MAX_VALUE);
    }
}
