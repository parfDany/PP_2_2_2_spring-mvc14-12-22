package web.DAO;

import org.springframework.stereotype.Repository;
import web.Model.User;

import java.util.List;



@Repository
public class UserDaoImpl implements UserDao{


    @Override
    public List<User> listAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(int id, User updatedUser) {

    }

    @Override
    public User show(int id) {
        return null;
    }
}

