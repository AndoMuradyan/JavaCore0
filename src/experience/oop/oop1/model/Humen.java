package experience.oop.oop1.model;

public class Humen {

    private String firstName;
    private String lastName;
    private int year;
    private boolean isArmenian;
    private char gender;


//    public void sayHello() {
//        System.out.println("Hello");
//    }
//
//    // void tpi
//    public void printFullName() {
//        System.out.println(firstName + " " + lastName);
//    }
//
//    //String aysinkn veradarcra
//    public String fullName() {
//        return firstName + " " + lastName;
//    }
//
//    public void sum(int x, int y) {
//        System.out.println(x + y);
//    }
//
//    public void print1toN(int n){
//        for (int i = 1; i <=n ; i++) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//    }

    public Humen(String firstName, String lastName, int year, boolean isArmenian, char gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.isArmenian = isArmenian;
        this.gender = gender;
    }

    public Humen() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Humen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", isArmenian=" + isArmenian +
                ", gender=" + gender +
                '}';
    }
}
