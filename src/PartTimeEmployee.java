public class PartTimeEmployee extends Employee {

    private Integer hoursWorked;
    private Integer hourlyRate;

    public PartTimeEmployee(String name, Integer id,Integer hoursWorked, Integer hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public Integer calculateSalary() {
        Integer totalSalary = hourlyRate*hoursWorked;
        return totalSalary;
    }
}
