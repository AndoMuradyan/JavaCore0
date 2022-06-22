package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(8);
        dynamicArray.add(4);
        dynamicArray.add(7);
        dynamicArray.add(11);
        dynamicArray.add(723);
        dynamicArray.add(71);
        dynamicArray.set(0, 5);
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.getByIndex(2));
        System.out.println(dynamicArray.getFirstIndexByValue(2));
        dynamicArray.add1(1, 2);
        dynamicArray.delete(2);


        dynamicArray.printArray();
    }
}
