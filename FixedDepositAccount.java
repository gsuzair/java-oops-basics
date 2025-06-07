public class FixedDepositAccount extends BankAccount{
    public FixedDepositAccount(String accNo, double balance, Person owner) {
        super(accNo, balance, owner);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.06;
    }
}
