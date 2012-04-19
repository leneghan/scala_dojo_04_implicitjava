package dojo;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Predicate;

final public class DataSource {

    private List<User> users = new ArrayList<User>();

    public DataSource(List<User> users){
        this.users = users;
    }
    
    public List findUsers(Predicate<User> predicate){
        List<User> found = new ArrayList<User>();
        for(User user : users){
            if(predicate.apply(user)){
                found.add(user);
            }
        }
        return found;
    }
}
