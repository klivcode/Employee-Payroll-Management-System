import java.util.ArrayList;
import java.util.List;

public class PayRollServiceSystem {

    private List<Employee> employeeList;

    public PayRollServiceSystem()
    {
        employeeList = new ArrayList<Employee>();
    }

    //add
    public void addEmployee(Employee employee)
    {
        System.out.println("Processing.................................!");
        employeeList.add(employee);
        System.out.println("Employee added successfully");
    }

    //remove
    public void removeEmployee(Integer employeeId)
    {
        Employee employeeToRemove = null;
        for(Employee employees : employeeList)
        {
           if(employees.getId()==employeeId)
           {
               employeeToRemove = employees;
               break;
           }
        }

        if(employeeToRemove != null)
        {    System.out.println("Deleting....................................!");
            employeeList.remove(employeeToRemove);
            System.out.println("Employee removed successfully");
        }
    }

    //display
    public void displayEmployees()
    {
        System.out.println("EMPLOYEES LIST");
        for(Employee employee : employeeList)
        {
            System.out.println(employee+"\n");
        }
    }

}
