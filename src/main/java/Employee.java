public class Employee {
    static String name;
    static String lastName;
    static int salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " last name : " + this.getLastName() +
                ", salary: " + this.getSalary();


    }
}



