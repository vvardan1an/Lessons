package homeWork.books;

import homeWork.books.command.CommandBook;
import homeWork.books.model.Author;
import homeWork.books.model.Book;
import homeWork.books.storage.AuthorStorage;
import homeWork.books.storage.BookStorage;

import java.util.Scanner;

public class BookDemo implements CommandBook {

    private static final Scanner scannerBook = new Scanner(System.in);
    private static final BookStorage bookStorage = new BookStorage();
    private static final AuthorStorage authorStorage = new AuthorStorage();

    private static boolean isRunning = true;

    public static void main(String[] args) {

        while (isRunning) {
            CommandBook.showCommands();
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
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }

    private static void addAuthor() {
        System.out.println("Please input author name.");
        String name = scannerBook.nextLine();
        System.out.println("Please input author surname.");
        String surName = scannerBook.nextLine();
        System.out.println("Please input email.");
        String email = scannerBook.nextLine();
        System.out.println("Please input gender. (Male or Female)");
        String gender = choseGender();

        Author author = new Author(name, surName, email, gender);
        authorStorage.add(author);
        System.out.println("Author created !");
    }

    private static String choseGender() {
        String gender = scannerBook.nextLine();
        if (gender.equals("Male") || gender.equals("Female")) {
            System.out.print("Thanks.");
        } else {
            System.out.println("Please input correct gender Male or Female");
            choseGender();
        }
        return gender;
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

        if (authorStorage.getSize() == 0) {
            System.out.println("Please add author");
            addAuthor();
        } else {
            authorStorage.print();
            System.out.println("Please chose author index.");
            int authorIndex = Integer.parseInt(scannerBook.nextLine());
            Author author = authorStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                System.out.println("Please correct index.");
                addBook();
            } else {
                System.out.println("Please input book title. ");
                String title = scannerBook.nextLine();
                System.out.println("Please input book price. ");
                double price = Double.parseDouble(scannerBook.nextLine());
                System.out.println("Please input book genre. ");
                String genre = scannerBook.nextLine();
                System.out.println("Please input book count. ");
                int count = Integer.parseInt(scannerBook.nextLine());


                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("Thank you ! Book added . ");
            }
        }
    }
}
