package experience.oop.oop3;

public class Student extends Human {

    private double mark;

    public Student(String name) {
        super(name);

    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
