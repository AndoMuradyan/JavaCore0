package chapters.chapters13;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Koнcтaнты перечислимого типа Apple :");
        Apple[] appleples = Apple.values();
        for (Apple a : appleples) {
            System.out.println(a);
//            System.out.println();
        }
            ap = Apple.valueOf("WINESAP");
            System.out.println("Пepeмeннaя ар содержит " + ap);

    }
}
