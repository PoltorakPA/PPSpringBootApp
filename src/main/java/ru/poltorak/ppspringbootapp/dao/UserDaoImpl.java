package ru.poltorak.ppspringbootapp.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.poltorak.ppspringbootapp.entity.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    public UserDaoImpl() {

    }

    @Override
    public List<User> getAllUsers() {
        // вернуть  createQuery от em .getResultList(); с показываением всех юзеров из User.class
        List<User> list = em.createQuery("FROM User", User.class).getResultList();
        return list;
    }

    @Override
    public User getUser(Integer id) {
        return em.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public void updateUser(User updateUser) {
        em.merge(updateUser);
    }

    @Override
    public void deleteUser(User deleteUser) {
        em.remove(em.contains(deleteUser) ? deleteUser : em.merge(deleteUser));
    }
}
