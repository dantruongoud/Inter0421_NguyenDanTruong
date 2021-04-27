import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee(){

    }
    public Employee(int id, String firstName, String lastName, int salary) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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


    public String getFullName() {
        return this.firstName + " "+ this.lastName;
    }

    @Override
    public String toString() {
        return "Employee@id=" + id + ", FullName=" + getFullName() + ", Salary=" + salary;
    }
    @Override
    public int compareTo(Employee employee) {
        if (id == employee.id)
            return 0;
        else if (id > employee.id)
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        List<Employee> Listemployee = new ArrayList<Employee>();

        Listemployee.add(new Employee(1, "Nguyen", "Truong", 265));
        Listemployee.add(new Employee(2, "Tran", "Dong", 2635));
        Listemployee.add(new Employee(9, "Ly", "Dat", 5776));
        Listemployee.add(new Employee(4, "Pham", "Hung", 1101));
        Listemployee.add(new Employee(8, "Duong", "Ly", 1010));
        Listemployee.add(new Employee(6, "To", "Nhi", 5454));
        Listemployee.add(new Employee(7, "Dinh", "Han", 779));
        Listemployee.add(new Employee(5, "Kim", "Tuan", 337));
        Listemployee.add(new Employee(10, "Vu", "Khang", 24576));
        Listemployee.add(new Employee(3, "Le", "Thinh", 7797));

        Collections.sort(Listemployee);
        for (Employee ep : Listemployee) {
            System.out.println(ep.toString());
        }
    }
}

