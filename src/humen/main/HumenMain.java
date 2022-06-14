package humen.main;


import humen.model.Car;
import humen.model.Humen;

public class HumenMain {
    public static void main(String[] args) {
        Humen humen1 = new Humen();
        humen1.firstName = "Armen";
        humen1.lastName = "Armenyan";
        humen1.gender = 'm';
        humen1.isArmenia = true;
        humen1.year = 2000;


        Humen humen2 = new Humen();
        humen2.firstName = "Ani";
        humen2.lastName = "grigoryan";
        humen2.gender = 'f';
        humen2.isArmenia = true;
        humen2.year = 2002;

        System.out.println(humen1.firstName + " " + humen1.lastName);
//tpel vor yuzri tarikne mec vory mece tox tpe
        if (humen1.year < humen2.year) {
            System.out.println(humen1.firstName);
        } else
            System.out.println(humen2.firstName);
//sout grelu karj dzev ? ev : verevi nuyn kody soutov
        System.out.println(humen1.year < humen2.year ? humen1.firstName : humen2.firstName);

//Car
        Car car1 = new Car();

        car1.year = 2020;
// es toxov ete chenq ta arjeq engine
// u guzenq tpelu ardyunqum ta inchvor ban
// inqy difolt ktpe 0.0 bayc 0.0 tpume e menak primitiv tiperin
// isk obektneri difolt arjeqy ktpe null orinak'
        System.out.println(car1.engine);
        System.out.println(car1.model);

//menq karoxenq mer yuzri anuny poxenq orinak;
        Humen h = new Humen();
        h.firstName = "ani";
        System.out.println(h.firstName);

        h.sayHello();
        humen2.sayHello();
//sotove anntat talisenq konkret vor yuzriny
//        System.out.println(humen1.firstName + " " + humen1.lastName);
//        System.out.println(humen2.firstName + " " + humen2.lastName);
//        System.out.println(h.firstName + " " + h.lastName);
// sranov menq kanchumenq metody vor tpi yuzri anun azganuny
        humen1.printFullName();
        humen2.printFullName();
        h.printFullName();

//sranov gorcoxutyunic heto talise arjeq return tal
        String s = humen1.fullName();
        System.out.println("Full name of humen1 is " + s);

        humen1.sum(4,6);

        humen1.print1toN(5);
        humen1.print1toN(15);
        humen1.print1toN(30);

    }
}
//static - popoxakanneri koxky metodneri koxky blokneri koxky
//staticnery hipi mej chen payvi'
//