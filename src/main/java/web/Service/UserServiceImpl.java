package web.Service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDao;
import web.Model.User;

import java.util.List;

@Component
@Transactional(readOnly = false)
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    public List<User> listAll() {
        return userDao.listAll();
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void update(int id, User updatedUser) {

        userDao.update(id, updatedUser);
    }

    public User show(int id) {
        return userDao.show(id);
    }

}
