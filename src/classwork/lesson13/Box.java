package classwork.lesson13;

public class Box {
    double width;
    double height;
    double depth;
    static String color ="red";
    static final int WARRANTY_YEAR =1;

    Box(double width,double height,double depth){
        this.width =width;
        this.height =height;
        this.depth=depth;
        A a = new A();
    }
    double volume(){
        return depth*height*width;
    }
    boolean equalTo(Box box){
        return this.width == box.width
                && height == box.height
                && depth == box.depth;

    }
    static void printColor(){
        System.out.println(color);
    }
    class A{

    }
}
