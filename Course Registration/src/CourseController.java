import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CourseController {
    private static CourseController instance;
    private List<Course>courses;

    public static  CourseController getInstance(){
        if(instance==null){
            instance = new CourseController();
        }
        return instance;
    }
    private CourseController() {
        this.courses = new ArrayList<>();
    }
    public void addCourse(Course course){
        this.courses
                .add(course);
    }

    public boolean bookCourse(Student student,Course course){

        synchronized (course){
            if(course.getCapacity() < course.getSeats()){
                course.setCapacity(course.getCapacity()+1);
                List<Course> courseList = student.getCourses();
                courseList.add(course);
                student.setCourses(courseList);
                return true;
            }
        }
        return false;
    }

}
