package chapters.chapters13;

public enum AppleC {
    JONATHAN(10),
    GOLDENDEL(9),
    REDDEL(7),

    WINESAP(15),
    CORTLAND(8);

    private int price;

    AppleC(int p) {
        price = p;
    }

    AppleC() {
        price = -1;
    }
    int getPrice(){
        return price;
    }
}
