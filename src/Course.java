import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printStudents() {
        students.forEach(student -> System.out.println(student.getName()));
    }
}
