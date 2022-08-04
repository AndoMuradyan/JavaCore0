package classwork.lesson17;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        c.printKuku();

        System.out.println(ShowKuku.getDefaultCount());

        printKuku5times(a);
        printKuku5times(b);

        ShowKuku o = new A();
    }

    static void printKuku5times(ShowKuku o) {
        for (int i = 0; i < 5; i++) {
            o.printKuku();
        }
    }
}
