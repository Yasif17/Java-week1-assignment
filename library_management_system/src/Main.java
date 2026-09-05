
import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while(running){
            System.out.println("\n ========= Library Management System =========");

            System.out.println("1: Add book");
            System.out.println("2: View all book");
            System.out.println("3: Search book by id or title");
            System.out.println("4: Issue book");
            System.out.println("5: Return book");
            System.out.println("6: Remove book");
            System.out.println("7: Exit");

            System.out.println("Select any one options");

            int choice;

            try {
                 choice = sc.nextInt();
                 sc.nextLine(); // it reads the full line of text until new line, means until user hit enter.
            }catch (InputMismatchException e){
                System.out.println("Invalid input, Please enter a number between 1-7.");
                sc.nextLine();
                continue;
            }


            switch(choice){
                case 1:
                    System.out.println("Enter title");
                    String title = sc.nextLine();

                    System.out.println("Enter author");
                    String author = sc.nextLine();

                    library.addBooks(title,author);
                    break;

                case 2:
                    library.viewAllBooks();
                    break;

                case 3:
                    System.out.println("Enter 1 for Search by id and 2 for by title");



                    int mode = sc.nextInt();
                    sc.nextLine(); // we add this because if we do not add this. it will clear the buffer. nextInt() only reads single digit and left the enter space. that take \n so clearing the \n we use nextline().


                    Book found = null;

                    if(mode<=0 || mode>2){
                        System.out.println("Please choose option only 1 or 2");
                        break;
                    }


                    if(mode == 1){
                        System.out.println("Enter the book id");
                        int id = sc.nextInt();
                        sc.nextLine(); // again we use for clearing the buffer \n

                         found = library.searchBookById(id);

                    }else if(mode==2){
                        System.out.println("Enter title");
                        found = library.searchBookByTitle(sc.nextLine());
                    }


                    if(found!=null){
                        System.out.println(found);
                    }else{
                        System.out.println("Not found");
                    }
                    break;


                case 4:

                    System.out.println("Enter book id");
                    int issueId = sc.nextInt();
                    sc.nextLine();
                    library.issueBook(issueId);
                    break;

                case 5:
                    System.out.println("Enter book id to return");
                    int returnId = sc.nextInt();
                    sc.nextLine();
                    library.returnBook(returnId);
                    break;

                case 6:

                    System.out.println("Enter book id to remove book");
                    int removeId = sc.nextInt();
                    sc.nextLine();
                    library.removeBook(removeId);
                    break;
                case 7:
                    running = false;
                    System.out.println("Thank you for visiting.");
                    break;
                default:
                    System.out.println("Please choose valid choice.");
            }
        }
        sc.close();


    }
}