package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User employee);
    List<User> getAllUser();
    User getUser(int id);
    void updateUser(int id, User user);
    void deleteUser(int id);
}
