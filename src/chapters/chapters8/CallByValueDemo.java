package chapters.chapters8;

public class CallByValueDemo {
    public static void main(String[] args) {
        CallByValue cl = new CallByValue();
        int a = 15, b = 20;
        System.out.println(" a и b до вызова : " + a + " " + b);
        cl.meth(a, b);
        System.out.println(" a и b до вызова : " + a + " " + b);
    }
}
