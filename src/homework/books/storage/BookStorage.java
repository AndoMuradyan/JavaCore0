package homework.books.storage;

import homework.books.book.Author;
import homework.books.book.Book;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;


    public void add(Book book) {
        if (books.length == size) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] temp = new Book[books.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = books[i];
        }
        books = temp;
    }


    public void printAllBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + books[i]);

        }
        System.out.println();
    }

    public Author printBooksByAuthorName(String authorName) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthorName().equals(authorName)) {
                System.out.println(books[i]);
            }
        }
        return null;
    }

    public void printBooksByGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (genre.equals(books[i].getGenre())) {
                System.out.println(books[i]);
            }
        }
    }

    public void printBooksByPriceRange(double price, double price1) {
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= price && books[i].getPrice() <= price1) {
                System.out.println(books[i]);

            }
        }
    }

    public int getSize() {
        return size;
    }

    public void deleteByBook(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        } else {

            for (int i = index; i < size; i++) {
                books[i] = books[i + 1];

            }
            size--;
        }

    }


}
