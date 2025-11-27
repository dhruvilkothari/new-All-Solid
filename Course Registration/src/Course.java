public class Course {
    private String name;
    private String code;
    private int seats;
    private int capacity;
    private Professor professor;

    public Course(String name, String code, int seats, Professor professor) {
        this.name = name;
        this.code = code;
        this.seats = seats;
        this.professor = professor;
        this.capacity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
