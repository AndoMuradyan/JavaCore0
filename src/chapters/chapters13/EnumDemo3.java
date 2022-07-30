package chapters.chapters13;

public class EnumDemo3 {
    public static void main(String[] args) {
        AppleC ap;
        System.out.println("Яблoкo сорта Wines ap стоит " +
                AppleC.WINESAP.getPrice() +
                " центов . \n");
        System.out.println("Цeны на все сорта яблок:");
        for (AppleC a : AppleC.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов.");

        }
    }
}
