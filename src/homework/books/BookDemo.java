package homework.books;


import homework.books.command.Commands;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.Register;
import homework.books.model.UserType1;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.storage.RegisterStorage;
import homework.students.model.UserType;


import java.util.Scanner;

import static homework.books.command.Commands.*;
import static homework.books.model.UserType1.*;


public class BookDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static RegisterStorage registerStorage = new RegisterStorage();
    private static Register currentRegister = null;


    public static void main(String[] args) {
        initData();
        boolean run = true;
        while (run) {
            Commands.printLoginCommand();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command: ");
            }
        }


    }

    private static void login() {
        System.out.println("Please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        Register user = registerStorage.getRegisterByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with" + emailPassword[0] + "does not exists!!");

        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                currentRegister = user;
                if (user.getUserType() == UserType1.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType1.USER) {
                    loginUser();
                }
            } else {
                System.out.println("Password is wrong!");
            }
        }
    }

    private static void loginUser() {
        System.out.println("Welcome " + currentRegister.getName());

        boolean run = true;

        while (run) {
            Commands.printUserCommand();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;

            }
            switch (command) {
                case LOGOUT:
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

                default:
                    System.out.println("invalid command");

            }
        }
    }


    private static void register() {
        System.out.println("Please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Please input correct data!");
        } else {
            if (registerStorage.getRegisterByEmail(userData[0]) == null) {
                Register register = new Register();
                register.setName(userData[0]);
                register.setSurname(userData[1]);
                register.setEmail(userData[2]);
                register.setPassword(userData[3]);
                register.setUserType(USER);
                registerStorage.add(register);
                System.out.println("User created");

            } else {
                System.out.println("User with " + userData[0] + " already exist!");
            }
        }


    }


    private static void loginAdmin() {
        System.out.println("Welcome " + currentRegister.getName());

        boolean run = true;

        while (run) {
            Commands.printUserCommand();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;

            }
            switch (command) {
                case LOGOUT:
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

    private static void initData() {
        Register admin = new Register("admin", "admin", "admin@mail.ru", "admin", ADMIN);
        registerStorage.add(admin);
        Author java = new Author("java", "poxos", "poxos@mail.ru", "F");
        Author mysql = new Author("mysql", "petros", "petros@mail.ru", "M");
        Author php = new Author("php", "poxosik", "poxosik@mail.ru", "M");
        authorStorage.add(java);
        authorStorage.add(mysql);
        authorStorage.add(php);
        bookStorage.add(new Book("java", java, 5, 250, "jn", admin));
        bookStorage.add(new Book("poxos", mysql, 24, 450, "fm", admin));
        bookStorage.add(new Book("pedofkj", php, 4, 450, "fc", admin));

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





