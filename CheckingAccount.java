public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accNo, double balance, Person owner) {
        super(accNo, balance, owner);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.00;
    }
}
