//package com.example.employee.controller;
//
//
//import com.example.employee.model.User;
//import com.example.employee.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@CrossOrigin("http://localhost:4200")
//@RestController
//@RequestMapping("/login")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping
//    public ResponseEntity<User> login(@RequestParam String username, @RequestParam String password){
//        User user = userService.getUser(username, password);
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
//}
