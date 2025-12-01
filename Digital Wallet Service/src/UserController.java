import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User>users;

    public UserController(){
        this.users = new ArrayList<>();
    }
    public String createUser(String name){
        User u1 = new User(name);
        return u1.getId();
    }
    public User getUserFromId(String id){
        for(User user:users){
            if(user.getId().equals(id))return user;
        }
        return null;
    }
}
