package com.example.powercosm.service;

import com.example.powercosm.models.User;
import org.springframework.http.HttpStatus;

public interface UserService {

    public Iterable<User> listUsers();

    public User createUser(User newUser);

    public User login(String username, String password);

    public HttpStatus deleteById(Long userId);

    public User getUser(String username);
}
