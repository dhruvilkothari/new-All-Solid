import java.util.HashMap;
import java.util.Random;

public class StudentController {


    private HashMap<Integer, Student> students;
    private static StudentController instance;

    private StudentController() {
        this.students = new HashMap<>();
    }
    public static StudentController getInstance(){
        if(instance ==  null){
            instance = new StudentController();
        }return  instance;
    }
    public void addStudent(String name){
        Student student = new Student(name, 1);
        students.putIfAbsent(student.getRollNumber(),student);
        return;
    }

}
