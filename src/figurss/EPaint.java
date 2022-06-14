package figurss;

public class EPaint {
    public static void main(String[] args) {
//        for (int i = 0; i < 2; i++) {
//            for (int j = 1; j <= 7; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <2 ; i++) {
//            for (int j = 0; j <=1 ; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 1; j <= 7; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <2 ; i++) {
//            for (int j = 0; j <=1 ; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 1; j <= 7; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//    }


//        for (int i = 0; i <2 ; i++) {
//            for (int j = 0; j <7 ; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <2 ; i++) {
//            for (int j = 0; j <=1 ; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <2 ; i++) {
//            for (int j = 0; j <7 ; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <2 ; i++) {
//            for (int j = 0; j <=1 ; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <2 ; i++) {
//            for (int j = 0; j <7 ; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                System.out.println(true);
                break;
            } else {
                System.out.println(false);
                break;
            }

        }

    }
}
