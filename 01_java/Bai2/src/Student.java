public class Student extends Person {
    private String name;
    private int age;
    private String address;
    private Double GPA;

    public Student( String name, int age, String address, Double GPA) {
        super(name, age, address);
        this.name = name;
        this.age = age;
        this.address = address;
        this.GPA = GPA;
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

    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    @Override
    public void display() {
        super.display();
    }
    @Override
    public String toString() {
        return "Student @Name=" + name + ", @AGE=" + age + ", @ADDRESS=" + address + ", @GPA=" + GPA;

    }
//    public int compareTo(Student stu) {
//        if (age == stu.age)
//            return 0;
//        else if (age < stu.age)
//            return 1;
//        else
//            return -1;
//    }
}
