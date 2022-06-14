package experience;

public class Abbreviate {
    String name;
    String surname;

    public Abbreviate(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    void print() {
//        System.out.println(name.toCharArray());
//        System.out.println(surname.toCharArray());
        System.out.println(name.charAt(0) +" "+ surname.charAt(0));

    }
}
