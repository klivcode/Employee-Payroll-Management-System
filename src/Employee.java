abstract class Employee {

    private String name;
    private Integer id;

    //Constructor Parametrized
    public Employee(String name, Integer id) {
        this.name = name;
        this.id = id;
    }


    /* Getter*/

    //Encapsulation
    public String getName() {
        return name;
    }
    //Encapsulation
    public Integer getId() {
        return id;
    }

    // Abstractions Method
    public abstract Integer calculateSalary();

   @Override
   public String toString() {
       return "Employee\n" +
              "ID: " + id + "\n" +
              "Name: " + name + "\n" +
              "Salary: " + calculateSalary() + "\n";
   }
}
