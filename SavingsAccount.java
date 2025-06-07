public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, double balance, Person owner) {
        super(accNo, balance, owner);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.03;
    }
}
