package experience.oop.oop2;

public class Teacher extends Humen {//teacher IS A Humen //marde
    private int salary;//teacher HAS A salary // uni ashxatavarc

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //sa kochvum e override
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary " + salary);
    }
}
