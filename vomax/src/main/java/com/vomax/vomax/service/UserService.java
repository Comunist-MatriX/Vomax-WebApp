package com.vomax.vomax.service;
import com.vomax.vomax.Database.User;
import com.vomax.vomax.UserDto.userDto;
import com.vomax.vomax.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.UUID;

@Service
public class UserService {

    private  final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public  void registerUser(userDto userdto) {
        User user = new User(userdto.firstName(),
                userdto.LastName()
                ,userdto.email()
                ,userdto.username()
                ,userdto.password()
                ,userdto.profilePic()
                , userdto.description(),userdto.dateOfbirth(),userdto.githupUrl(),userdto.dateOfsignup());
        this.userRepository.save(user);
    }


}



