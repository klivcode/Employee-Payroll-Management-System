public class FullTimeEmployee extends Employee {

    private Integer monthlySalary;

    public FullTimeEmployee(String name, Integer id, Integer monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public Integer calculateSalary() {
        return monthlySalary;
    }
}
