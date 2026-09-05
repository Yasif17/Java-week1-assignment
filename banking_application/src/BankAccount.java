
class BankAccount {

    private double balance;

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
        if(amount<=0){
            System.out.println("Amount must be positive");
            return balance;
        }

        if(balance<amount){
            System.out.println("Insufficient Balance");
            return balance;
        }

        balance -= amount;
        System.out.println("Amount withdraw Successfully.");
        return balance;

    }

}