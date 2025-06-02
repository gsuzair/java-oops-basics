public class Employee extends Person{

    private Integer employeeId;
    private String role;
    private String salary;

    public Employee(String name, String age, Integer id, Integer employeeId, String role, String salary) {
        super(name, age, id);
        this.employeeId = employeeId;
        this.role = role;
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public Integer setEmployeeId(Integer employeeId) {
        return this.employeeId = employeeId;
    }
}
