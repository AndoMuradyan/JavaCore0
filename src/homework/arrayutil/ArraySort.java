package homework.arrayutil;

public class ArraySort {
    void number(int[]array){
        int num=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
            System.out.print(array[i]+" ");
        }


    }
    void number1(int[]array){
        int num ;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}
