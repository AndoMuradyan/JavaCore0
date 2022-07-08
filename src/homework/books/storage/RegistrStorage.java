package homework.books.storage;

import homework.books.book.Registr;

public class RegistrStorage {
    private Registr[] registrs = new Registr[10];
    private final int size = 0;


    public void addRe() {
        if (registrs.length == size) {
            extend();
        }
    }

    public void extend() {
        Registr[] temp = new Registr[registrs.length + 10];
        System.arraycopy(registrs, 0, temp, 0, size);
        registrs = temp;
    }


}
