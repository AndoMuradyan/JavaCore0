package homework.practice;

public class PracticeHomework {
    long convert(int minutes) {
        return minutes * 60;
    }

    int calcAge(int years) {
        return years * 366;
    }

    int nextNumber(int number) {
        return number + 1;
    }

    boolean isSameNum(int a, int b) {
//        if (a == b) {
//            return true;
        return a == b;
//        } else

    }

    boolean lessThanOrEqualToZero(int number) {
//        if (number <= 0) {
//
//            return true;
//        } else
//            return false;
        return number <= 0;
    }

    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            System.out.print("Array1 ");
            return array1.length;
        } else {
            System.out.print("Array2 ");
            return array2.length;
        }


    }

}

