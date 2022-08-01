package classwork.lesson13.dinamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(7);
        dynamicArray.add(3);
        dynamicArray.add(3);
        dynamicArray.add(0);
        dynamicArray.add(3);
        dynamicArray.add(28);
        dynamicArray.add(65);
        dynamicArray.add(65);
        dynamicArray.print();
        dynamicArray.deleteByIndex(5);
        dynamicArray.print();
          }
}
