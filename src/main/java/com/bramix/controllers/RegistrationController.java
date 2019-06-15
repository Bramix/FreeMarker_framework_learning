package com.bramix.controllers;

import com.bramix.domain.Role;
import com.bramix.domain.User;
import com.bramix.repos.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {

    private final UserRepo userRepo;

    public RegistrationController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping ("/registration")
    public String getReg () {
        return "registration";
    }

    @PostMapping ("/registration")
    public String addUser (User user, Map<String, Object> model){
        User byUsername = userRepo.findByUsername(user.getUsername());
        if (byUsername != null){
            model.put ("message", "user is already exists");
            return "registration";
        }
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save (user);
        return "redirect:/login";
    }
}
