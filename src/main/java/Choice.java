import java.util.Scanner;

public class Choice {
    public Choice() {
        System.out.println("1 – Print sum of all employees salary\n" +
                "\n" +
                "2 – Display all employees data\n" +
                "\n" +
                "3 – Add new employee\n" +
                "\n" +
                "4 – End program\n" +
                "\n" +
                "Pick number");

        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        {
            switch (input) {
                case 1:
                    System.out.println("Sum of all employees salary");

                    new Choice();
                case 2:

                    new Choice();
                case 3:
                    new addEmployee();
                    new Choice();
                case 4:
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }
    }
}


