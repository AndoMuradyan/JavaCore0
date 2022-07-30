package experience.reducebutGrow;

public class ReduceButGrow {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int[] red = {2, 7, 5, 8};
        int[] red1 = {2, 4, 3, 6};
        for (int i = 0; i < red.length; i++) {
            int x = red[i];
            sum = sum + x;
        }
        for (int i = 0; i < red1.length; i++) {
            int y = red1[i];
            sum1 = sum1 + y;
        }
        System.out.println(sum1 - sum + sum1 + sum * sum);

        }


}
