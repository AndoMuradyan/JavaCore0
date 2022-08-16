package experience.oop.oop1;


import experience.oop.oop1.model.Car;
import experience.oop.oop1.model.Humen;

public class Lesson5 {
    public static void main(String[] args) {

        Humen humen1 = new Humen();
        humen1.setFirstName("Aram");
        humen1.setLastName("aramyan");
        humen1.setGender('m');
        humen1.setArmenian(true);
        humen1.setYear(2000);

        Humen humen2 = new Humen();
        humen2.setFirstName("Arami");
        humen2.setLastName("aramyan");
        humen2.setGender('m');
        humen2.setArmenian(true);
        humen2.setYear(2002);


        System.out.println(humen1.getFirstName() + " " + humen1.getLastName());
        if (humen1.getYear() < humen2.getYear()) {
            System.out.println(humen1.getFirstName());
        } else
            System.out.println(humen2.getFirstName());
//        amen primitiv tarberak unen iranc defult arjeqnery ete
//        ays depkum menq enginin arjeq chtanq inqy ktpe 0.0
//        Stringi difolt arjeqy null n e
        Car car1 = new Car();
        car1.setModel("Bmw");
        car1.setYear(2020);

        System.out.println(car1.getEngine());
        Humen h = new Humen();
        h.setFirstName("Ani");


//        h.sayHello();
//        humen2.sayHello();
//
//        humen1.printFullName();
//        humen2.printFullName();
//        h.printFullName();
//
//        String s = humen1.fullName();
//        System.out.println("full name of human1 is " + s);
//
//        humen1.sum(4, 6);
//        humen1.print1toN(5);

//        sranov menq pravite dashty darcnum enq gorcoxutyun or krananq ashxatinq

        Car car = new Car();
        car.setEngine(-8.8);
        System.out.println(car.getEngine());

        car.setModel("jeep");
        car.setEngine(5.5);
        car.setYear(2020);
        System.out.println(car.getModel() + " " + car.getYear());

        String s = "Hello From Lesson 5";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
//ete uzenaynq vochte string e ayl array petke uxaki grenq s.lenght -->
// <--aranc pakagceri tpeluce bdi arrayi[i] tanq
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println("=============");
       // ays kodov tpum enq s tareri qanaky
        int countOfS = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 's') {
                countOfS++;
            }
        }
        System.out.println(countOfS);
        // bolor tarery mecatar
        System.out.println(s.toUpperCase());
        String poqratar = s.toLowerCase();
        System.out.println(poqratar);

    }
}
