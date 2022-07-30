package chapters.chapters8;

public class OverloadBoxCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2=new Box();
        Box mycube = new Box (7);
        Box myclone = new Box();
        double vol;
        vol =mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        vol=mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        vol=mycube.volume();
        System.out.println("Oбъeм куба равен " + vol);
        vol=myclone.volume();
        System.out.println("Oбъeм клона равен " + vol);
    }
}
