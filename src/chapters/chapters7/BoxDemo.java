package chapters.chapters7;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Oбъeм равен " + vol);

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Oбъeм равен " + vol);


    }
}
