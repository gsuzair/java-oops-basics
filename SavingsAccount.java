public class SavingsAccount extends BankAccount implements Taxable {
    public SavingsAccount(String accNo, double balance, Person owner) {
        super(accNo, balance, owner);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.03;
    }

    @Override
    public double calculateTax() {
        return getBalance() * 0.05;
    }
}
