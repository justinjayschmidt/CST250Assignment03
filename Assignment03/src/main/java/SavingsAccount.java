
public class SavingsAccount extends BankAccount {

    double annualInterestRate = 0.08;

    public SavingsAccount(String owner, double balance, double annualInterestRate) {
        super(owner, balance);
        this.annualInterestRate = annualInterestRate;
    }

}
