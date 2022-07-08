package homework.books.command;

public interface Commands {

    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_AUTHOR_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHOR = 7;
    int DELETE_BOOK_BY_INDEX = 8;
    int USERNAME_PASSWORD=1;

    static void printCommand() {
        System.out.println("please input " + EXIT + " for exit: ");
        System.out.println("please input " + ADD_BOOK + "  for add book: ");
        System.out.println("please input " + PRINT_ALL_BOOKS + " print books: ");
        System.out.println("please input " + PRINT_BOOKS_AUTHOR_NAME + "print author books : ");
        System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " print books genre: ");
        System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " print books price range: ");
        System.out.println("Please input " + ADD_AUTHOR + " for add author: ");
        System.out.println("Please input " + PRINT_ALL_AUTHOR + " for print all author: ");
        System.out.println("Please input " + DELETE_BOOK_BY_INDEX + " for delete all book: ");



    }
    static void command(){
        System.out.println("Please input " + USERNAME_PASSWORD + " for login password: ");
    }


}
