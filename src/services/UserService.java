package services;

import entities.User;
import repositories.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository repository = new UserRepository();

    public UserService() {
    }

    public void addUser(User user) {
        repository.addUser(user);
    }

    public User getUserById(Long id) {
        return repository.getUserById(id);
    }

    public List<User> getAllUsers() {
        return repository.getAllUsers();
    }

    public void deleteUserById(Long id) {
        repository.deleteUserById(id);
    }

    public User validateLogin(String cpf, String password) {
        List<User> users = repository.getAllUsers();
        for (User i : users) {
            if (i.getCpf().equals(cpf) && i.getPassword().equals(password)) {
                return i;
            }
        }
        return null;
    }
}
