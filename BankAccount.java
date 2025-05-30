public class BankAccount {

    private String accountNumber;
    private String balance;
    private Person owner;

    public BankAccount(String accountNumber, String balance, Person owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public String getBalance() {
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

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
