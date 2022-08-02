package classwork.lesson15;

public class B extends A {
    int k;

    B(int y) {
        super(y);
    }

    B() {

    }

    void methB() {
        System.out.println("methB");
    }

    void showXYK() {
        showY();
        System.out.println(k + x);
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
