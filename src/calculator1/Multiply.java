package calculator1;

public class Multiply {

    public static Double multiply(Double a, Double b) {
        double result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Multiply m = new Multiply();
        System.out.println(m.multiply(4.4, 5.5));
    }
}
