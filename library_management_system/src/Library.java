import java.util.*;
import java.lang.*;

class Library {
    HashMap<Integer, Book> list = new HashMap<>();
    private int nextId = 1;

    private void printMessage(String msg) {
        System.out.println("\n" + msg);
    }

    public void addBooks(String title, String author) {
        Book book = new Book(nextId, title, author);
        list.put(nextId, book);
        printMessage("Book added Successfully:");
        System.out.println(book);
        nextId++;
    }

    public void viewAllBooks() {
        if (list.isEmpty()) {
            printMessage("No books in library");
            return;
        }
        System.out.println();
        for (Book b : list.values()) {
            System.out.println(b);
        }
    }

    public Book searchBookById(int id) {
        if (id <= 0) {
            printMessage("Id cannot be 0 or negative");
            return null;
        }
        return list.get(id);
    }

    public Book searchBookByTitle(String title) {
        for (Book b : list.values()) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public boolean issueBook(int id) {
        if (id <= 0) {
            printMessage("Id cannot be negative");
            return false;
        }

        Book issuedBook = list.get(id);

        if (issuedBook == null) {
            printMessage("Book Not Found");
            return false;
        }

        if (!issuedBook.getAvailability()) {
            printMessage("Book is already issued");
            return false;
        }

        issuedBook.setAvailability(false);
        printMessage("Book Issued Successfully:");
        System.out.println(issuedBook);
        return true;
    }

    public boolean returnBook(int id) {
        if (id <= 0) {
            printMessage("Id cannot be negative");
            return false;
        }

        Book returnedBook = list.get(id);

        if (returnedBook == null) {
            printMessage("Book not found");
            return false;
        }

        if (returnedBook.getAvailability()) {
            printMessage("The book is not issued");
            return false;
        }

        returnedBook.setAvailability(true);
        printMessage("Book returned successfully:");
        System.out.println(returnedBook);
        return true;
    }

    public boolean removeBook(int id) {
        if (id <= 0) {
            printMessage("Id cannot be negative");
            return false;
        }

        if (!list.containsKey(id)) {
            printMessage("Book not found");
            return false;
        }

        Book removedBook = list.remove(id);
        printMessage("Book removed Successfully:");
        System.out.println(removedBook);
        return true;
    }
}