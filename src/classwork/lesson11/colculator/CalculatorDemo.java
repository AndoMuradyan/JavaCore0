package classwork.lesson11.colculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double plus = calculator.plus(4, 5);
        System.out.println("plus:-> " + plus);
        double minus = calculator.minus(4, 2);
        System.out.println("minus:-> " + minus);
        double multiply = calculator.multiply(4, 5);
        System.out.println("multiply:-> " + multiply);
        double divide = calculator.divide(20, 4);
        System.out.println("divide:-> " + divide);
    }
}
