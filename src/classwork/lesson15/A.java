package classwork.lesson15;

public class A {
    int x;
    private int y = 2;

    A(int y) {
         this.y=y;
    }
    A(){

    }
    void methA(){
        System.out.println("MethA");
    }
    void showY(){
        System.out.println(y);
    }
}
