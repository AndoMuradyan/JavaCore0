package experience.oop.oop2;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 //    classi mej unenq nuyn anunov tarber funkcianer kochvum e metod ovrloding
//
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void f() {

    }

    public void f(int a) {
        System.out.println(a);
    }

    public void f(int a, String b) {
        System.out.println(a + b);
    }
}
