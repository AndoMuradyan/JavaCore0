package figurss;

public class TPaint {
    public static void main(String[] args) {

//        T

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" ");

            }

            for (int j = 0; j < 2; j++) {
                System.out.print(" *");

            }
            System.out.println();

        }

    }
}
