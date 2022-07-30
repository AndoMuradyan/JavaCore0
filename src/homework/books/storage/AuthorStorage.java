package homework.books.storage;

import homework.books.model.Author;


public class AuthorStorage {
    private Author[] authors = new Author[10];
    private int size = 0;


    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] temp = new Author[authors.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = authors[i];
        }
        authors = temp;
    }


    public void printAllAuthor() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + authors[i]);

        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public Author getAuthorByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        return authors[index];
    }


}
