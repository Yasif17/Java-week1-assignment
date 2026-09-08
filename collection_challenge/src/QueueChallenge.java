
import java.util.*;


class QueueChallenge{
    public static void main(String[] args){
        Queue<String> customers = new LinkedList<>();

        // adding into queue
        customers.add("customer1");
        customers.add("customer2");
        customers.add("customer3");
        customers.add("customer4");
        customers.add("customer5");

        // peek at the front item
        System.out.println("Serving: " + customers.peek());

        // remove from queue
        System.out.println("Serving: " + customers.poll());

        // Display queue contents
        for(String custs:customers){
            System.out.println("- " + custs);
        }

    }
}