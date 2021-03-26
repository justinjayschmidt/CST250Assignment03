
public class MainClass extends BankAccount {

    public static void main(String[] args) {//args is for passing arguments to program if it wants it//
        CheckingAccount EmilysAccount; //This is creating a new instance of Chcking
        EmilysAccount = new CheckingAccount("Emily", 200.00, 10.00);
        //Checking account has parameters assigned to it, so you need to define these new paramaters in the new isntance
        SavingsAccount JoesSavingsAccount;
        JoesSavingsAccount = new SavingsAccount("Joe", 100.00, 0.08);

//        Create a Savings Account for Joe with an initial balance of $100, and an annual interest rate of 1%.
        System.out.println("The savings account owner is: " + JoesSavingsAccount.getOwner());
        System.out.println(JoesSavingsAccount.getOwner() + "'s current balance is: " + JoesSavingsAccount.getBalance());
        System.out.println("The annual interest rate for this account is: " + JoesSavingsAccount.annualInterestRate + "%");
        System.out.println("-------------");
        System.out.println("-------------");
//    2. Create a Checking Account for Emily with an initial balance of $200, and an insufficient funds fee of $10.
        System.out.println("The checking account owner is: " + EmilysAccount.getOwner());
        System.out.println(EmilysAccount.getOwner() + "'s current balance is: " + EmilysAccount.getBalance());
        System.out.println("The insufficient funds fee is: $" + EmilysAccount.insufficientFundsFee);
        System.out.println("-------------");
        System.out.println("-------------");
//    3. Deposit $50 to Emily’s account.
        BankAccount Deposit;
        Deposit = new BankAccount.Deposit(50.00, EmilysAccount.getBalance(), EmilysAccount.getOwner());
//    4. Withdraw $25 from Joe’s account.
        BankAccount Withdraw;
        Withdraw = new BankAccount.Withdraw(25.00, JoesSavingsAccount.getBalance(), JoesSavingsAccount.getOwner());
//    5. Process a check for the amount of $50 for Emily.
        BankAccount DepositCheck;
        DepositCheck = new BankAccount.Deposit(50.00, EmilysAccount.getBalance());
//    6. Transfer $100 from Emily’s account to Joe’s account.
        public static transfer(double withdraw, double, deposit, double balance1, double balance2){
            
        }

    }

}
