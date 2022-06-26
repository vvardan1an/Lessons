package homeWork.books;

import java.util.Scanner;

public class BookDemo implements CommandBook {

    private static final Scanner scannerBook = new Scanner(System.in);
    private static final BookStorage bookStorage = new BookStorage();
    private static boolean isRunning = true;


    public static void main(String[] args) {
        init();
        while (isRunning) {
            showCommands();
            int command = Integer.parseInt(scannerBook.nextLine());
            switch (command) {
                case EXIT:
                    isRunning = false;
                    System.out.println("EXIT");
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case ALL_BOOKS:
                    bookStorage.print();
                    break;
                case BY_AUTHOR_ALL_BOOKS:
                    printByAuthorName();
                    break;
                case BY_GENRE_ALL_BOOKS:
                    printByGenre();
                    break;
                case PRICE_RANGE:
                    printByPriceRange();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;

            }
        }
    }

    private static void init() {
        bookStorage.add(new Book("s", "Defo", 60, 1, "ss"));
        bookStorage.add(new Book("d", "Gog", 100, 1, "ss"));
        bookStorage.add(new Book("a", "Dog", 120, 1, "ss"));
        bookStorage.add(new Book("z", "Dogfgf", 116, 1, "ss"));
    }

    private static void showCommands() {
        System.out.println("Please enter 0 to exit. ");
        System.out.println("Please enter 1 to add book. ");
        System.out.println("Please enter 2 to print all books. ");
        System.out.println("Please enter 3 to print books by author name. ");
        System.out.println("Please enter 4 to print books by genre. ");
        System.out.println("Please enter 5 to print books by price range. ");
    }

    private static void printByGenre() {
        System.out.println("Please input book genre. ");
        String genre = scannerBook.nextLine();
        bookStorage.printBookByGenre(genre);
    }

    private static void printByAuthorName() {
        System.out.println("Please input author name. ");
        String authorName = scannerBook.nextLine();
        bookStorage.printBookByAuthorName(authorName);
    }

    private static void printByPriceRange() {
        System.out.println("Please input first book price.  ");
        double minPrice = Double.parseDouble(scannerBook.nextLine());
        System.out.println("Please input second book price.  ");
        double maxPrice = Double.parseDouble(scannerBook.nextLine());
        bookStorage.printBookByPrice(minPrice, maxPrice);
    }

    private static void addBook() {
        System.out.println("Please input book title. ");
        String title = scannerBook.nextLine();
        System.out.println("Please input author name. ");
        String authorName = scannerBook.nextLine();
        System.out.println("Please input book price. ");
        double price = Double.parseDouble(scannerBook.nextLine());
        System.out.println("Please input book genre. ");
        String genre = scannerBook.nextLine();
        System.out.println("Please input book count. ");
        int count = Integer.parseInt(scannerBook.nextLine());


        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
        System.out.println("Thank you ! Book added . ");
    }

}
