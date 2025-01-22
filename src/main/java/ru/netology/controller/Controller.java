package ru.netology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.service.UserService;

@RestController
public class Controller {
    UserService service;

    public Controller(UserService service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    public String getProductName(@RequestParam("name") String name) {
        return service.getProductName(name);
    }
}
