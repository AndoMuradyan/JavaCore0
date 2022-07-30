package classwork.lesson9;

public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 7, 2, 57, 8, 9, 2};
        int x = 7;
        int i = 0;
        for (int number : numbers) {
            if (number == x) {
                System.out.println(i);
                break;

            }
            i++;
        }
    }
}
