package homework.arrayutil;

public class ArrayUtil {
    //    1     Տպեք մասիվի բոլոր էլեմենտները,
    void arrayy(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }

    //  2     Տպեք մասիվի ամենամեծ թիվը,
    void max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
//        return max;
        System.out.println("max = " + max);
    }

    //   3    Տպեք մասիվի ամենափոքրը թիվը
    void min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
//        return min;
        System.out.println("min = " + min);
    }

    //   4    Տպեք մասիվի բոլոր զույգ էլեմենտները,
    int[] even(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
//                System.out.print(array[i] + " ");
                result[i] = array[i];
                System.out.println(array[i]);


            }
        }


        return array;

    }

    //   5    Տպեք մասիվի բոլոր կենտ էլեմենտները։
    void odd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    //   6    Տպեք զույգերի քանակը։
    int evenCount(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;

            }
        }
        return even;
    }

    //   7    Տպեք կենտերի քանակը
    int oddCount(int[] array) {
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd++;

            }
        }
        return odd;
    }

    //   8,9    Տպեք մասիվի էլեմենտների գումարը։
    int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


}