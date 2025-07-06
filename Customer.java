public class Customer extends Person implements LoanEligible{

    private Integer customerId;

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
}
