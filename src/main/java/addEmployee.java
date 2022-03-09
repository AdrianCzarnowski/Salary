import java.util.ArrayList;
import java.util.Scanner;

public class addEmployee {
    public addEmployee() {

        Scanner input = new Scanner(System.in);

        ArrayList<String> employees = new ArrayList<String>();
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = input.nextLine();

        System.out.println("Last name: ");
        employee.lastName = input.nextLine();

        System.out.println("salary: ");
        employee.salary = Integer.parseInt(input.nextLine());

        String data = employee.name + " " + employee.lastName + " " + employee.salary + " $";
        employees.add(data);
        System.out.println((data) + " Added!" );

    }
}






