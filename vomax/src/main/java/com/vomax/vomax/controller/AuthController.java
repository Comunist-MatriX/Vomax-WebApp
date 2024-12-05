package com.vomax.vomax.controller;
import com.vomax.vomax.UserDto.userDto;
import com.vomax.vomax.repository.UserRepository;
import org.springframework.web.multipart.MultipartFile;
import com.vomax.vomax.Database.User;
import com.vomax.vomax.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;
    private final UserRepository userRepository;

    @Autowired
    public AuthController(UserService userService,UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    // Sign Up Endpoint
    @PostMapping("/signup")
        void signUp(@RequestBody userDto userdto) {
        userService.registerUser(userdto);
    }

    // Login Endpoint
//    @PostMapping("/login")
//    public String login(@RequestParam String username, @RequestParam String password) {
//        boolean authenticated = userService.authenticateUser(username, password);
//        if (authenticated) {
//            return "Login successful!";
//        } else {
//            return "Invalid username or password!";
//        }
//    }
}
