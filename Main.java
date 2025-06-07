public class Main {
    public static void main(String[] args) {
        Person ali = new Person("Ali", "30", 101);

        BankAccount sa = new SavingsAccount("SA101", 1000, ali);
        BankAccount fd = new FixedDepositAccount("FD202", 5000, ali);

        System.out.println("Owner of SA: " + sa.getOwner().getName());
        System.out.println("Interest on SA: " + sa.calculateInterest());

        System.out.println("Owner of FD: " + fd.getOwner().getName());
        System.out.println("Interest on FD: " + fd.calculateInterest());

    }
}
