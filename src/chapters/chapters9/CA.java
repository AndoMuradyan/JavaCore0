package chapters.chapters9;

public class CA extends AC {
    int i;

    CA(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Chlen i v superClasse:" + super.i);
        System.out.println("Chlen i v podklasse: " + i);
    }
}
