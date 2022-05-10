public class BankAccount {
    double balance;
    String accountHolder;

    public BankAccount(String accountHolderName, double balance) {
        accountHolder = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        balance -= withdrawalAmount;
    }

    public String toString() {
        return ("\n" + accountHolder + "'s account balance: " + balance);
    }

}
