package homework.books.model;

public class Author {
    private String name;
    private String surName;
    private String mail;
    private String gander;


    public Author() {
    }

    public Author(String name, String surName, String mail, String gander) {
        this.name = name;
        this.surName = surName;
        this.mail = mail;
        this.gander = gander;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", mail='" + mail + '\'' +
                ", gander='" + gander + '\'' +
                '}';
    }



}
