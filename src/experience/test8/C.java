package experience.test8;

public class C implements A, B {
    //    interfesi u classi tarberutyuny vor interfesy filder chuni chi nkaragrum obyekt (interfesy)
//    interfesi sahmanumy ay interfesy vori mej ka nra mej ka mek had abstrak fukci ka kochvum e funkcional interfes
    @Override
    public void f() {
        A.super.f();
        System.out.println("C");
        B.super.f();
    }

    @Override
    public int sum(int x, int y) {
        return 0;
    }

    public static String convert(String a) {
        return "helo " + a;
    }
}
