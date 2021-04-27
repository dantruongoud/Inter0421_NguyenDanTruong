import java.util.ArrayList;
import java.util.List;

public class EmployeeCau2a {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getFullName() {
        return this.firstName + " "+ this.lastName;
    }

    public EmployeeCau2a() {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public static void main(String[] args) {

        EmployeeCau2a employee = new EmployeeCau2a();
        employee.setId(1);
        employee.setFirstName("Nguyen");
        employee.setLastName("Truong");
        employee.setSalary(1000);

        System.out.println(employee.getId()+" "+employee.getFullName()+" "+employee.getSalary());
    }
}
