package chapters.chapters9;

public class Boxx {
    private double width;
    private double height;
    private double depth;

    Boxx(Boxx ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    Boxx(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Boxx() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Boxx(double len) {
        width = height = depth = len;
    }

    double volume(){
        return  width*height*depth;
    }
}
