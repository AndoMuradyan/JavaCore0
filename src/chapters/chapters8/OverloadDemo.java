package chapters.chapters8;

public class OverloadDemo {


    public static void main(String[] args) {
        Overload ob = new Overload();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Peзyль тaт вызова ob . test ( 123.25} : " + result);
    }
}
