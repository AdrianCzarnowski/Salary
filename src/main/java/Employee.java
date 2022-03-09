public class Employee {

    static String name;
    static String lastName;
    static int salary;


    private String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    private String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getAllData() {
        return "Name: " + this.getName() + " last name : " + this.getLastName() +
                ", salary: " + this.getSalary();


    }

}



