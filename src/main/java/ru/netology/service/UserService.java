package ru.netology.service;

import org.springframework.stereotype.Service;
import ru.netology.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getProductName(String name) {
        return repository.getProductName(name);
    }
}
