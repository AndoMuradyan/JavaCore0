package chapters.chapters13;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.REDDEL;
        System.out.println("znachenia ap: " + ap);
        System.out.println();

        ap=Apple.GOLDENDEL;
        if (ap==Apple.GOLDENDEL){
            System.out.println("Пepeмeннaя ар содержит GoldenDel .\n ");
        }
        switch (ap){
            case JONATHAN:
                System.out.println( "Copт Jonathan красный.");
                break;
            case GOLDENDEL:
                System.out.println( "Copт Golden Delicious желтый.");
                break;
            case REDDEL:
                System.out.println( "Copт Red Delicious красный . ");
                break;
            case WINESAP:
                System.out.println( "Copт Winesap красный.");
                break;
            case CORTLAND:
                System.out.println( "Copт Cortland красный.");
                break;
        }
    }
}
