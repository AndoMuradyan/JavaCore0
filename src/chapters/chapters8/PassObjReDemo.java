package chapters.chapters8;

public class PassObjReDemo {
    public static void main(String[] args) {
        PassObjRe po = new PassObjRe(15, 20);
        System.out.println(" ob.a и оЬ.b до вызова : " + po.a + " " + po.b);
        po.meth(po);
        System.out.println(" ob.a и оЬ.b до вызова : " + po.a + " " + po.b);
    }
}
