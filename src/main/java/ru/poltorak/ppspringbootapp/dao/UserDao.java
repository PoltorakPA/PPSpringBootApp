package ru.poltorak.ppspringbootapp.dao;


import ru.poltorak.ppspringbootapp.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUser(Integer id);

    void saveUser(User user);

    void updateUser(User updateUser);

    void deleteUser(User deleteUser);


}
