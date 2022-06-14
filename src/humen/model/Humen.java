package humen.model;

public class Humen {
    public String firstName = "aram";
    public String lastName;
    public int year;
    public boolean isArmenia;
    public char gender;


    public void sayHello() {
        System.out.println("Hello");
    }

    // sranov tpum enq vochmi ban chenq aknkalum vor veradarcni
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    //sranov vochte tpi ay veradarcni
    public String fullName() {
        return firstName + " " + lastName;

    }

    //void tpi mi veradarcra
    public void sum(int x, int y) {
        System.out.println(x + y);

    }

    public void print1toN(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

}
