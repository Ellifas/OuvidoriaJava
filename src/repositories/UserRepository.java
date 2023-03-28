package repositories;

import entities.Praise;
import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final List<User> database = new ArrayList<>();

    public UserRepository() {
    }

    public void addUser(User user) {
        database.add(user);
    }

    public User getUserById(Long id) {
        User user = new User();
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getId().equals(id)) {
                user = database.get(i);
            }
        }
        return user;
    }

    public List<User> getAllUsers() {
        return database;
    }

    public void deleteUserById(Long id) {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getId().equals(id)) {
                database.remove(database.get(i));
            }
        }
    }
}
