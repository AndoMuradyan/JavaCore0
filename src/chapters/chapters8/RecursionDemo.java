package chapters.chapters8;

public class RecursionDemo {
    public static void main(String[] args) {
        Recursion recursion = new Recursion(10);
        int i;
        for (int j = 0; j < 10; j++) {
            recursion.values[j] = j;

        }
        recursion.printArray(10);
    }
}
