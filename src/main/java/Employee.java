public class Employee {

    static String name;
    static String surname;
    static int salary;

    private String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    private String getSurname() {
        return surname;
    }

    void setLastName(String surname) {
        this.surname = surname;
    }

    public static int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAllData() {
        return "Name: " + this.getName() + " last name : " + this.getSurname() +
                ", salary: " + this.getSalary();


    }

}



