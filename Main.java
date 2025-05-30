public class Main {
    public static void main(String[] args) {
        // Step 1: Create a person
        Person person = new Person("Ali", "30", 101);

        // Step 2: Create a bank account and link it to the person
        BankAccount account = new BankAccount("123456", "5000", person);

        // Step 3: Print some basic info
        System.out.println("Account Owner: " + account.getOwner().getName());
        System.out.println("Balance: " + account.getBalance());

    }
}
