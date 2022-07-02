package chapters.chapters9;

public class DemoSuperBoxx {
    public static void main(String[] args) {
        BoxxWeight mybox1 = new BoxxWeight(10, 20, 15, 34.3);
        BoxxWeight mybox2 = new BoxxWeight(2, 3, 4, 0.076);
        BoxxWeight mybox3 = new BoxxWeight();
        BoxxWeight mycube = new BoxxWeight(3, 2);
        BoxxWeight myclone = new BoxxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println(" Bec mybox2 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println(" Bec mybox2 равен " + mybox2.weight);
        System.out.println();


        vol = mybox3.volume();
        System.out.println("Oбъeм mybox3 равен " + vol);
        System.out.println(" Bec mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Oбъeм myclone равен " + vol);
        System.out.println(" Bec myclone равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен " + vol);
        System.out.println(" Bec mycube равен " + mycube.weight);
        System.out.println();
    }
}
