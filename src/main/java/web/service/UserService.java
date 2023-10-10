package web.service;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    void save(User user);

    User show(Long id);

    Optional<User> show(String email);

    void update(User updatedUser);

    void delete(Long id);
}
