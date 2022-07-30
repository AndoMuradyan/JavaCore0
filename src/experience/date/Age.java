package experience.date;


public class Age {


    public static void main(String[] args) {
//        int y = 0;
        int[] max = {7, 2, 30, 8, -9, -5};
        int x = max[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i] % 2 != 1) {
                x = max[i];

            }
//            y = x;
        }

        System.out.println(x);
    }
}
