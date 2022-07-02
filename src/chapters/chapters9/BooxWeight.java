package chapters.chapters9;

public class BooxWeight extends Boox {
    double weight;

    BooxWeight(BooxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    BooxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight=m;
    }
    BooxWeight(){
        super();
        weight=-1;
    }

}
