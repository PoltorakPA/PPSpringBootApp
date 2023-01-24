package ru.poltorak.ppspringbootapp.service;


import ru.poltorak.ppspringbootapp.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(Integer id);

    void saveUser(User user);

    void updateUser(Integer id, User updatedUser);

    void deleteUser(User deleteUser);
}
