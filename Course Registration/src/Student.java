import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    List<Course> courses;
    private int rollNumber;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
