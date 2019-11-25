package com.ngocvm.example.Day55.userDao;

public class UserDAOImpl extends AbstractUserDAO {
    public void delete(User user) {
        System.out.println("Delete the user " + user.getName());
    }

    public void save(User user, String dept) {
        System.out.println("Save the user " + user.getName() + " to " + dept);
    }

    public static void main(String[] args) {
        UserDAOImpl userDAO = new UserDAOImpl();

        User user1 = new User();
        user1.setName("John");

        userDAO.save(user1);
        userDAO.save(user1, "IT");
    }
}
