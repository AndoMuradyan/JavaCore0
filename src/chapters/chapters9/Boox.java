package chapters.chapters9;

public class Boox {
    private double width;
    private double height;
    private double depth;



    Boox(Boox ob){
        width=ob.width;
        height= ob.height;
        depth=ob.depth;
    }
    Boox(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Boox(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Boox(double len){
        width=height=depth=len;

    }
    double volume(){
        return width*height*depth;
    }
}
