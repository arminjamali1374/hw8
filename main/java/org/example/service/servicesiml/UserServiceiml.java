package org.example.service.servicesiml;

import org.example.entity.User;
import org.example.repository.UserRepository;
import org.example.repository.repositoryiml.UserRepositoryiml;
import org.example.service.UserService;

import java.sql.SQLException;

public class UserServiceiml implements UserService {

    static UserRepository userRepository = new UserRepositoryiml();

    @Override
    public void save(User user) throws SQLException {
        if (userRepository.existsByUsername(user.getUsername()) && userRepository.existsByEmail(user.getEmail())) {
            System.out.println("user or email already exists");
            return;
        }
        if (!isValidEmail(user.getEmail())){
            System.out.println("not valid email");
            return;
        }
        if (!isValidPassword(user.getPassword())){
            System.out.println("not valid password");
            return;
        }
        userRepository.save(user);
    }


    @Override
    public User load(int userId) throws SQLException {
        return userRepository.load(userId);
    }

    @Override
    public void delete(int userId) throws SQLException {
        userRepository.delete(userId);
    }

    private boolean isValidEmail(String email){
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    private boolean isValidPassword(String password){
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
    }
}
