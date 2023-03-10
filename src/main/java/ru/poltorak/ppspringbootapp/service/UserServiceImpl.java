package ru.poltorak.ppspringbootapp.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.poltorak.ppspringbootapp.dao.UserDao;
import ru.poltorak.ppspringbootapp.entity.User;


import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(Integer id, User updatedUser) {
        updatedUser.setId(id);
        userDao.updateUser(updatedUser);
    }

    @Override
    @Transactional
    public void deleteUser(User deleteUser) {
        userDao.deleteUser(deleteUser);
    }
}
