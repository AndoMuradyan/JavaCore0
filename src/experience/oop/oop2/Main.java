package experience.oop.oop2;

public class Main {
    public static void main(String[] args) {
//        qast gorcoxutyuny ashxatum e primitiv tipy primitiv tipi het
//        chi ashxatum obyekty primitiv tipi het aysinkn Stringy inti
        //byte arjeqy texapoxum enq inti arjeqin klini hnaravore
        byte x = 4;
        int a = x;
        System.out.println(a);
//ete guzenq hakaraqy qast bdi enenq greladzevy
        byte b = 4;
        int y = 7;
        b = (byte) y;
        System.out.println(b);
// ete byte samanic durs enqq grum u uzum qast anel inqy + i depkum minus tive darcnum hakaraq fragy
//       128 taluc tpume -128 isk -129 depkum +127
        byte w = 4;
        int e = 128;
        w = (byte) e;
        System.out.println(w);
// ays depkum chi gumare 1+5 ayl ktpe aranzdin 15
        x = 1;
        System.out.println("barev " + x + 5 + " java");
//        isk ays depkum kgumare ev ktpe 6
        x = 1;
        System.out.println("barev " + (x + 5) + " java");
//      construkty iranic nerkayacnum e funkcia ;vory chuni veradarcnox arjeq
//      canstruktry bdi unena nuyn anuny inchor class
        Student s1 = new Student();
        s1.setAge(44);
        s1.setName("hayk");

        s1.sum(4, 5);
        s1.sum(4, 5, 1);
        s1.f();
        s1.f(4);
        s1.f(4, " java");
        System.out.println("--------------------");
        // jarangutyan orinak
        // jarangutyan mej bazmajaraangutyun chka mi classy karoxe jarange mek class
        //jarangutyan depkum private hasaneli chen vochmi tex iranc het
        //ashxatelu hamar kanchum enq iranc set ery ev getery
        Teacher t1 = new Teacher();
        t1.setName("hayk");
        t1.setYear(2020);
        t1.setSalary(1000);
        t1.setPhone("54545");
        System.out.println("-----------");
        Administrator a1 = new Administrator();
        a1.setName("Anna");
        a1.setDepartment("Music");
        a1.setYear(1999);
        a1.setPhone("4554545");

//printInfo vory ktpe tvyalner;
        // ovraidy parntic ekac funkcianery karoxenq verpoxerl vory kochvum e ovrlod
        t1.printInfo();
        a1.printInfo();


    }
}
