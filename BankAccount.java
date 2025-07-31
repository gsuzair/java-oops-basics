import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {

    private String accountNumber;
    protected  double balance;
    private Person owner;
    private List<Transaction> transactions = new ArrayList<>();

    public BankAccount(String accountNumber, double balance, Person owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public Person getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public abstract double calculateInterest();

    public void deposit(int amount){
        balance = balance + amount;
        transactions.add(new Transaction(amount, Transaction.TransactionType.DEPOSIT, LocalDateTime.now()));
    }

    public void withdraw(int amount){
        if(amount >= balance){
            balance = balance - amount;
            transactions.add(new Transaction(amount, Transaction.TransactionType.WITHDRAW, LocalDateTime.now()));
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public List<Transaction> getTransactions(){
        return transactions;
    }
}
