import java.util.*;
import java.lang.*;

class Library{
    HashMap<Integer,Book> list = new HashMap<>();
    private int nextId = 1;

    public void addBooks(String title, String author){
        Book book = new Book(nextId,title,author);
        list.put(nextId,book);
        System.out.println("Book added Successfully: " + book.getBookId());
        nextId++;
    }

    public void viewAllBooks(){

        if(list.isEmpty()){
            System.out.println("No books in library");
            return;
        }

        for(Book b:list.values()){
            System.out.println(b);
        }
    }

    public Book searchBookById(int id){
        if(id<=0){
            System.out.println("Id cannot be 0 or negative");
            return null;
        }

        Book found = list.get(id);


        return found;

    }

    public Book searchBookByTitle(String title){
        for(Book b:list.values()){
            if(b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }

    public boolean issueBook(int id){
        if(id<=0){
            System.out.println("Id cannot be negative");
            return false;
        }

        Book b = list.get(id);

        if(b == null){
            System.out.println("Book Not Found");
            return false;
        }

        if(!b.getAvailability()){
            System.out.println("Book is already issued");
            return false;
        }

        b.setAvailability(false);
        System.out.println("Book Issued Successfully");
        return true;

    }

    public boolean returnBook(int id) {
        if (id <= 0) {
            System.out.println("Id cannot be negative");
            return false;
        }

        Book b = list.get(id);

        if(b==null){
            System.out.println("Book not found");
            return false;
        }

        if(b.getAvailability()){
            System.out.println("The book is not issued");
            return false;
        }

        b.setAvailability(true);
        System.out.println("Book returned successfully");
        return true;
    }

    public boolean removeBook(int id){
        if(id<=0){
            System.out.println("Id cannot be negative");
            return false;
        }

        if(!list.containsKey(id)){
            System.out.println("Book not found");
            return false;
        }

        list.remove(id);
        System.out.println("Book remove Successfully");
        return true;
    }





}