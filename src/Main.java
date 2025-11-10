import javax.sound.midi.Soundbank;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        PayRollServiceSystem payRollServiceSystem = new PayRollServiceSystem();
        Scanner scanner = new Scanner(System.in);
       while (true)
       {
           System.out.println("MENU");
           System.out.println("===================================================================\n");
           System.out.println("1. Add Employee");
           System.out.println("2. Display Employee Details");
           System.out.println("3. Delete Employee");
           System.out.println("4. Exit");
           System.out.println("===================================================================\n");

           int serviceNumber = scanner.nextInt();

           switch (serviceNumber) {
               case 1:
                   System.out.println("Enter Employee ID\n");
                   int employeeId = scanner.nextInt();
                   System.out.println("Enter the Name of the Employee\n");
                   String employeeName = scanner.next();
                   System.out.println("Enter Job Type of Employee\n");
                   System.out.println("Type: f for FULL TIME and p for PART TIME\n");
                   String jobType = scanner.next();
                   switch (jobType.toUpperCase()) {
                       case "F":
                           System.out.println("Enter the Salary of Employee\n");
                           Integer salary = scanner.nextInt();
                           Employee emp1= new  FullTimeEmployee(employeeName,employeeId,salary);
                           payRollServiceSystem.addEmployee(emp1);
                           break;

                           case "P":
                               System.out.println("Enter Hours Worked\n");
                               Integer hoursWorked = scanner.nextInt();
                               System.out.println("Enter Your Hourly Rate");
                               Integer hourlyRate = scanner.nextInt();
                               Employee emp2 = new PartTimeEmployee(employeeName,employeeId,hoursWorked,hourlyRate);
                               payRollServiceSystem.addEmployee(emp2);
                               break;

                               default:
                                   System.out.println("Invalid Input");
                   }
                   break;

                   case 2:
                       System.out.println("Employee Details");
                       System.out.println("=======================================================================");
                       payRollServiceSystem.displayEmployees();
                       break;

                       case 3:
                           System.out.println("Enter Employee ID\n");
                           Integer employeeID = scanner.nextInt();
                           System.out.println("Deleting Employee details");
                           payRollServiceSystem.removeEmployee(employeeID);
                           break;

                           case 4:
                               System.out.println("Exiting............!");
                               System.exit(0);

               default:
                   throw new IllegalArgumentException("Invalid Input");
           }
       }



    }
}