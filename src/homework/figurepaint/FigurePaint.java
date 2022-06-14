package homework.figurepaint;

public class FigurePaint {

    void figureOne(int n) {
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    void figureTwo(int n) {
//              *
//            * *
//          * * *
//        * * * *
//      * * * * *

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    void figureThree(int n) {
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }

    }

    void figureFour(int n) {
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        for (int i = n; i > 0; i--) {
            for (int j = n; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    void figureFive(int n) {
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
