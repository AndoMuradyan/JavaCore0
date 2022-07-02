package homework.books;


import homework.books.book.Author;
import homework.books.book.Book;
import homework.books.command.Commands;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import java.util.Scanner;
import static homework.books.command.Commands.*;

public class BookDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();


    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            Commands.printCommand();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.printAllBooks();
                    break;
                case PRINT_BOOKS_AUTHOR_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHOR:
                    authorStorage.printAllAuthor();
                    break;
                case DELETE_BOOK_BY_INDEX:
                    deleteByIndex();
                    break;
                default:
                    System.out.println("invalid command");


            }
        }
    }


    private static void addBook() {
        if (authorStorage.getSize() != 0) {
            authorStorage.printAllAuthor();
            System.out.println("please choose index");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            Author author = authorStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                System.out.println("please chose correct index!!!");
                addBook();
            } else {
                System.out.println("please choose author name: ");
                String authorName = scanner.nextLine();
                bookStorage.printBooksByAuthorName(authorName);
                System.out.println("Please input book title: ");
                String title = scanner.nextLine();
                System.out.println("Please input price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Input Book's count");
                int count = Integer.parseInt(scanner.nextLine());
                System.out.println("Input Book's genre");
                String genre = scanner.nextLine();

                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("book created");
            }
        }

    }

    private static void addAuthor() {
        System.out.println("please input author name");
        String name = scanner.nextLine();
        System.out.println("please input author surname");
        String surname = scanner.nextLine();
        System.out.println("please input author email");
        String email = scanner.nextLine();
        System.out.println("please input author gender");
        String gender = scanner.nextLine();
        if (!gender.equals("MALE") && !gender.equals("FAMALE")) {
            System.out.println("please choose correct gender");
            addAuthor();
        } else {
            Author author = new Author(name, surname, email, gender);
            authorStorage.add(author);
            System.out.println("Author created");
        }

    }


    private static void printBooksByAuthorName() {
        System.out.println("Please input author name");
        String bookName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(bookName);

    }

    private static void printBooksByGenre() {
        System.out.println("Input the Genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBooksByPriceRange() {
        System.out.println("please input prices books");
        double price = Double.parseDouble(scanner.nextLine());
        double price1 = Double.parseDouble(scanner.nextLine());
        bookStorage.printBooksByPriceRange(price, price1);
    }


    private static void deleteByIndex() {
        bookStorage.printAllBooks();
        System.out.println("please choose book index");
        int index = Integer.parseInt(scanner.nextLine());
        bookStorage.deleteByBook(index);

    }
}

