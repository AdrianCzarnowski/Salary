import java.util.ArrayList;
import java.util.Scanner;

public class addEmployee {

    ArrayList<String> employees = new ArrayList<String>();
    Employee employee = new Employee();
    Scanner input = new Scanner(System.in);

    public addEmployee() {

        System.out.println("Name: ");
        employee.name = input.nextLine();

        System.out.println("Last name: ");
        employee.surname = input.nextLine();

        System.out.println("salary: ");
        employee.salary = Integer.parseInt(input.nextLine());

        String data = employee.name + " " + employee.surname + " " + employee.salary + " $";
        employees.add(data);
        System.out.println((data) + " Added!");

    }
}






