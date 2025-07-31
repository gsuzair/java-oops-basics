import java.util.ArrayList;
import java.util.List;

public class Customer extends Person implements LoanEligible{

    private Integer customerId;
    private List<BankAccount> accounts = new ArrayList<>();

    public Customer(String name, String age, Integer id, Integer customerId) {
        super(name, age, id);
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public Integer setCustomerId(Integer customerId) {
        return this.customerId = customerId;
    }

    @Override
    public boolean isEligibleForLoan() {
        return Integer.parseInt(getAge()) >= 21;
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

}
