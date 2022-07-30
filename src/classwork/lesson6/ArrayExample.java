package classwork.lesson6;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {87, 55, 21, -7, 0};
        System.out.println(numbers.length);

        int lastIndex = numbers.length - 1;

        System.out.println(numbers[lastIndex]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");

        }
        numbers[4] = 74;
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + "");

        }
    }
}
