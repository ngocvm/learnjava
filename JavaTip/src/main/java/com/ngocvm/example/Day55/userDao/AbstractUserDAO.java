package com.ngocvm.example.Day55.userDao;

public abstract class AbstractUserDAO implements UserDAO {
    public void save(User user) {
        System.out.println("The user " + user.getName() + " is saved.");
    }

    public abstract void delete(User user);
}
