package experience.collections;

public class Humen {
    private String name;
    private int age;
    private int salary;


    public Humen(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Humen() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    // sence kexni toStringy
    @Override
    public String toString() {
        return "{" + name + "," + age + "," + salary + "}";
    }

//    implimets arecinq ays metoty vor karoxananq hamematenq humennerin
//    ev sortavorenq poqric mec
//    this.age - o.age; sa tarkov e sortavoru
//    this.name.compareTo(o.name) sa anunnerov

//    implements Comparable<Humen> classi koxky avelacnenq ev es metody kashxati
//    @Override
//    public int compareTo(Humen o) {
//        return this.age - o.age;
//        return this.name.compareTo(o.name);
//    }

}
