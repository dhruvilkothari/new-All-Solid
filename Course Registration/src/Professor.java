import java.util.ArrayList;
import java.util.List;

public class Professor extends User{
    private List<Course>courses;
    public Professor(String name, ArrayList<Course>courses) {
        super(name);
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
