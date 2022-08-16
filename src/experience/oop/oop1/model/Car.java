package experience.oop.oop1.model;
//JavaBean ete asumen uremn haskananq sa
public class Car {
    private String model;
    private double engine;
    private int year;

//    public double getEngine() {
//        return engine;
//    }
////sranov paymanenq dnum or chkrananq 0 ic cacxik tiv tanq
////    private dashti het ashxatelu
//    public void setEngine(double e) {
//        if (e>0)
//        engine = e;
//
//    }

    public Car(String model, double engine, int year) {
        this.model = model;
        this.engine = engine;
        this.year = year;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                '}';
    }
}
