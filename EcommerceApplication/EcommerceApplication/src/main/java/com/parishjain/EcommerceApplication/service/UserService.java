package com.parishjain.EcommerceApplication.service;


import com.parishjain.EcommerceApplication.models.User;
import com.parishjain.EcommerceApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public String addUser(User user) {
        userRepository.save(user);
        return "User have been saved successfully.";
    }

    public User getUserById(Integer id){
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()){
            return userOptional.get();
        }
        else return null;
    }
}
