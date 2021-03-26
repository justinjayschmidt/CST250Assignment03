
public class CheckingAccount extends BankAccount {

    public double insufficientFundsFee = 10.00;

    public CheckingAccount(String owner, double balance, double insufficientFundsFee) {
        super(owner, balance);
        this.insufficientFundsFee = insufficientFundsFee;
    }

}
