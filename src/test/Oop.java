package test;

public class Oop {
    public static void main(String[] args) {
        int[] array = {10, 20, 3, 5, 7, 500,5};
        int zuyg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                zuyg++;
            }
        }
        System.out.println(zuyg);
    }
}
