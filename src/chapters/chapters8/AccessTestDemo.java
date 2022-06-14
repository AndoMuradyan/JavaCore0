package chapters.chapters8;

public class AccessTestDemo {
    public static void main(String[] args) {
        AccessTest at = new AccessTest();
        at.a = 10;
        at.b = 20;
//        at.c=100;    sxal


        at.setc(100);
        System.out.println("a,b i c: " + at.a + " " + at.b + " " + at.getc());
    }
}
