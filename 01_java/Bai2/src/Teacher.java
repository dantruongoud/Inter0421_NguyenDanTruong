public class Teacher extends Person {
    private String      name;
    private int age;
    private String address;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public Teacher(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void display() {
        super.display();
    }
    @Override
    public String toString() {
        return "Teacher @Name=" + name + ", @AGE=" + age + ", @ADDRESS=" + address + ", @SALARY=" + salary;
    }
    public int compareTo(Teacher tc) {
        if (salary == tc.salary)
            return 0;
        else if (salary > tc.salary)
            return 1;
        else
            return -1;
    }
}
