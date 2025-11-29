import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TaskController {
    private ConcurrentHashMap<String, Task>tasks;

    public TaskController(){
        this.tasks = new ConcurrentHashMap<>();
    }

    public void addTask(String name, String description, User user, TaskPriority taskPriority){
        Task t = new Task(name, description, user, taskPriority);
        tasks.put(t.getId(),t);
    }
    public void updateTask(String id, HashMap<Object,Object>updates){
        Task task
                 = tasks.get(id);
        if(task == null)return;
        synchronized (task){
            for(Object key: updates.keySet()){
                if(key.equals("user")){
                    task.setUser((User) updates.get(key));
                    // simialr add all field.

                }
            }
        }
    }

}
