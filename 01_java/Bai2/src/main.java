import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {


        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(new Student("Truong", 15, "Da Nang", 9.0));
        listStudent.add(new Student("Dong", 25, "Ha Noi", 9.0));
        listStudent.add(new Student("Dat", 18, "Quang Nam", 9.0));
        listStudent.add(new Student("Chau", 20, "Hoi An", 9.0));
        listStudent.add(new Student("Sang", 21, "Hue", 9.0));

        System.out.println("Danh sach 5 student:");
        Collections.sort(listStudent, Comparator.comparingInt(Student::getAge));
        for (Student st : listStudent){
            System.out.println(st.toString());
        }


        System.out.println(" ");
        List<Teacher> listTeacher = new ArrayList<Teacher>();
        listTeacher.add(new Teacher("Hung", 35, "Da Nang", 1250));
        listTeacher.add(new Teacher("Ly", 28, "Quang Nam", 1000));
        listTeacher.add(new Teacher("Phung", 35, "Quang Ngai", 3256));
        listTeacher.add(new Teacher("Co", 30, "Quang Binh", 5659));
        listTeacher.add(new Teacher("Tuan", 45, "Tp Hcm", 3232));
        System.out.println("Danh sach 5 Teacher: ");
        Collections.sort(listTeacher, Comparator.comparingInt(Teacher::getSalary));
        for (Teacher tc : listTeacher){
            System.out.println(tc.toString());
        }


        System.out.println(" ");
        System.out.println("Danh Sach 3 Teacher co luong cao nhat: ");
        listTeacher.subList(listTeacher.size() - 3, listTeacher.size()).forEach(teacher -> System.out.println(teacher.toString()));


        System.out.println(" ");
        System.out.println("Danh Sach 3 Student co tuoi nho nhat: ");
        listStudent.subList(listStudent.size() - 3, listStudent.size()).forEach(student -> System.out.println(student.toString()));

    }
}

