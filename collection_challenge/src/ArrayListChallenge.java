import java.util.*;

class ArrayListChallenge{
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();


        // add an element
        books.add("DSA With JAVA");
        books.add("SpringBoot");
        books.add("Microservices and docker");


        System.out.println("Remove an element \n");
        books.remove("DSA With JAVA");         // note - it is case sensitive, will match full exact string, only delete first appearence not second duplicate value, no error if not found.


        System.out.println("Update an element \n");
        books.set(0, "Java");

        System.out.println("Search an element by value");
        String search = "Java";
        boolean found = books.contains(search);
        System.out.println("found: " + found + "\n");

        System.out.println("Search an element by index");
        int position = books.indexOf("Java");
        String found2 = books.get(position);
        System.out.println("found: " + found2 + "\n");

        System.out.println("Iterate all elements");
        for (String b : books) {
            System.out.println(b);
        }
    }

}