package homework.books;


import java.util.Scanner;

import static homework.books.Commands.*;

public class BookDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input " + EXIT + " for exit: ");
            System.out.println("please input " + ADD_BOOK + "  for add book: ");
            System.out.println("please input " + PRINT_ALL_BOOKS + " print books: ");
            System.out.println("please input " + PRINT_BOOKS_AUTHOR_NAME + "print author books : ");
            System.out.println("please input " + PRINT_BOOKS_BY_GENRE + "print books genre: ");
            System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + "print books price range: ");


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
                default:
                    System.out.println("invalid command");


            }
        }
    }

    private static void printBooksByPriceRange() {
        System.out.println("please input prices books");
        double price = Double.parseDouble(scanner.nextLine());
        double price1 = Double.parseDouble(scanner.nextLine());
        bookStorage.printBooksByPriceRange(price, price1);
    }

    private static void printBooksByGenre() {
        System.out.println("Input the Genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre.trim());
    }

    private static void addBook() {
        System.out.println("Please input book title: ");
        String title = scanner.nextLine();
        System.out.println("Please input author name: ");
        String authorName = scanner.nextLine();
        System.out.println("Please input price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Input Book's count");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Book's genre");
        String genre = scanner.nextLine();


        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
        System.out.println("book created");

    }

    private static void printBooksByAuthorName() {
        System.out.println("Input Author's Name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName);
    }


}
