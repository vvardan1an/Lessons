package homeWork.books.command;

public interface CommandBook {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int ALL_BOOKS = 2;
    int BY_AUTHOR_ALL_BOOKS = 3;
    int BY_GENRE_ALL_BOOKS = 4;
    int PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;


    static void showCommands() {
        System.out.println("Please enter " + EXIT + " to exit. ");
        System.out.println("Please enter " + ADD_BOOK + " to add book. ");
        System.out.println("Please enter " + ALL_BOOKS + " to print all books. ");
        System.out.println("Please enter " + BY_AUTHOR_ALL_BOOKS + " to print books by author name. ");
        System.out.println("Please enter " + BY_GENRE_ALL_BOOKS + " to print books by genre. ");
        System.out.println("Please enter " + PRICE_RANGE + " to print books by price range. ");
        System.out.println("Please enter " + ADD_AUTHOR + " to add author. ");
    }
}
