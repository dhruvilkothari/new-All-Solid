public class BookingManager {
    private  static  BookingManager instance;
    private CourseController courseController;
    private StudentController studentController;

    private BookingManager( ){
        this.studentController = StudentController.getInstance();
        courseController = CourseController.getInstance();
    }

    public static  BookingManager getInstance(){
        if(instance ==  null){
            instance = new BookingManager();
        }
        return instance;
    }

    public boolean bookCourse(Course course, Student student){
        return courseController.bookCourse(student,course);
    }



}
