package dao;
import java.util.List;
import entity.MyUser;

public interface UserDao {
    public boolean login(String name,String password);
    public boolean register(MyUser user);
    public List<MyUser> getUserAll();
    public boolean delete(String id);
    public boolean update(String name, String id);
}
