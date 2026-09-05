
import java.util.*;


class BankingApp{

    private BankAccount bankAccount = new BankAccount();
    private Scanner sc = new Scanner(System.in);


    public void start() {

        boolean running = true;
        while (running) {
            System.out.println("\n ========== Sample Bank Application ==========");
            System.out.println("1: Deposit");
            System.out.println("2: Withdraw");
            System.out.println("3: Balance enquiry");
            System.out.println("4: Exit");
            System.out.println("Please choos any option");


            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter any nuber.");
                sc.nextLine();
                continue;
            }


            switch (choice) {
                case 1:
                    handleDeposit();
                    break;

                case 2:
                    handleWithdraw();
                    break;

                case 3:
                    System.out.println("Current Balance: " + bankAccount.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using \n Sample Bank Application");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid number. Please enter any number.");

            }
        }
        sc.close();
    }

    private void handleDeposit(){
        try {
            System.out.println("Please Enter any amount");
            double amount = sc.nextDouble();
            double currentBalance = bankAccount.getBalance();
            double updatedBalance = bankAccount.deposit(amount);

            if(currentBalance!=updatedBalance) {
                System.out.println("Current Balance : " + updatedBalance);
            }

        }catch(InputMismatchException e){
            System.out.println("Invalid input. Please Enter a valid numeric amount");
            sc.nextLine();
        }
    }

    private void handleWithdraw(){
        try{
            System.out.println("Please enter amount");
            double amount = sc.nextDouble();
            double currentBalance = bankAccount.getBalance();
            double updatedBalance = bankAccount.withdraw(amount);

            if(currentBalance!=updatedBalance) {
                System.out.println("Current Balance : " + updatedBalance);
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid input. Please Enter a valid numeric amount");
            sc.nextLine();        }
    }



}