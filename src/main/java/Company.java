import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    {

        System.out.println("Enter 5 employee's date ");

        for (int c = 1; c < 6; c++) {

            Employee employee = new Employee();

            ArrayList<String> employees = new ArrayList<>();
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter employee's name " + c);
            employee.name = scan.nextLine();

            System.out.println("Please enter employee's last name " + c);
            employee.lastName = scan.nextLine();

            System.out.println("Please enter employee's salary " + c);
            employee.salary = scan.nextInt();

            String data = employee.name + " " + employee.lastName + " " + employee.salary + " $";
            employees.add(data);
            System.out.println(data);
        }

    }

}




