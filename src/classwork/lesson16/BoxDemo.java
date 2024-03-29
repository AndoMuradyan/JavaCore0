package classwork.lesson16;

public class BoxDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(1, 2, 3);
        ColorBox colorBox = new ColorBox(2, 3, 4, 9);
        colorBox.equals(boxWeight);
        printVolumeDouble(boxWeight);
        printVolumeDouble(colorBox);
    }

    static void printVolumeDouble(Box box) {
        System.out.println(box.volume() * 2);
        if (box instanceof ColorBox) {
            System.out.println("color");
            ColorBox colorBox = (ColorBox) box;
            System.out.println(colorBox.color);
        }
    }
}