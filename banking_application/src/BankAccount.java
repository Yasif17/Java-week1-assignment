
class BankAccount {

    private double balance;
    private int acceptedAttempt = 0;
    private static final int MAX_ATTEMPTS = 3;


    public BankAccount(){
        this.balance = 0.0;
    }

    // get the balance of user (also use for balance enquiry)
    public double getBalance(){
        return balance;
    }

    public double deposit(double amount){
        if(amount<=0){
            System.out.println("Amount must be positive");
            return balance;
        }

        balance += amount;
        System.out.println("Amount deposit Successfully.");
        return balance;
    }

    public double withdraw(double amount){

        if(acceptedAttempt>=MAX_ATTEMPTS){
            System.out.println("Max attempt are done. Please try next day.");
            return balance;
        }

        if(amount<=0){
            System.out.println("Amount must be positive");
            acceptedAttempt++;
            return balance;
        }

        if(balance<amount){
            System.out.println("Insufficient Balance");
            acceptedAttempt++;
            return balance;
        }

        balance -= amount;
        acceptedAttempt++;
        System.out.println("Amount withdraw Successfully.");
        return balance;

    }

}