package homework.books.book;

public class Registr {
    public String name;
    public String surname;
    public String login;
    public String password;

    public Registr() {
    }

    public Registr(String name, String surname, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Registr{" +
                "name='" + name + '\'' +
                ", surnname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
