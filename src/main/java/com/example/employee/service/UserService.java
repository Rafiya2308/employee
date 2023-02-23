//package com.example.employee.service;
//
//
//import com.example.employee.exception.RecordNotFound;
//import com.example.employee.model.User;
//import com.example.employee.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public User getUser(String username, String password){
//        User user = userRepository.getUser(username, password);
//        System.out.print("user "+user);
//        if(user==null){
//            throw new RecordNotFound("No record found for username : "+username);
//        }
//        return  user;
//    }
//}
