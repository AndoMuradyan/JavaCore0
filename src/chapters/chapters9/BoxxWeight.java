package chapters.chapters9;

public class BoxxWeight extends Boxx {
    double weight;

    BoxxWeight(BoxxWeight ob) {
        super(ob);
        weight = ob.weight;

    }
    BoxxWeight(double w,double h,double d,double m){
        super(w,h,d);
        weight=m;


    }
    BoxxWeight(){
        super();
        weight=-1;
    }
    BoxxWeight(double len,double m){
        super(len);
        weight = m;
    }
}

