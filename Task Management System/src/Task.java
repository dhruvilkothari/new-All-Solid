import java.util.UUID;

public class Task {
    private final String id;
    private String name;
    private String description;
    private User user;
    private TaskPriority taskPriority;

    public Task(String name, String description, User user, TaskPriority taskPriority) {
        this.name = name;
        this.description = description;
        this.user = user;
        this.taskPriority = taskPriority;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }
}
