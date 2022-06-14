package homework.arrayutil1;

public class ArraySortt {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    num = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = num;
                }
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    num = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = num;
                }
            }
            System.out.print(numbers[i] + " ");
        }

    }
}
