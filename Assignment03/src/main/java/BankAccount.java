
public class BankAccount {

    private String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void Deposit(double amount, double balance, String owner) {
        balance = balance + amount;
        System.out.println("After depositing $" + amount + " the current balance of " + owner + "'s account is: " + balance);
    }

    public void Withdraw(double amount, double balance, String owner) {
        balance = balance - amount;
        System.out.println("After withdrawing $" + amount + " the current balance of " + owner+ "'s accountis: " + balance);
    }

}
