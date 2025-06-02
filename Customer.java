public class Customer extends Person{

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
}
