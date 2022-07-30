package chapters.chapters8;

public class RetObDemo {
    public static void main(String[] args) {
        RetOb ro = new RetOb(2);
        RetOb ro2;
        ro2 = ro.incrByTen();
        System.out.println("ro.a: " + ro.a);
        System.out.println("ro2.a: " + ro2.a);

        ro2 = ro2.incrByTen();
        System.out.println(" ro2 .a после второго увеличения значения : "
                + ro2.a);
    }
}
