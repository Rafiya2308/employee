package com.example.employee.controller;


import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> empList = employeeService.getAllEmployees();
        return new ResponseEntity<>(empList, HttpStatus.OK);
    }


    @GetMapping("/id")
    public ResponseEntity<Employee> getEmployeeById(@RequestParam("id") Long id){
        Employee empList = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(empList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
       Employee employee1= employeeService.saveEmployee(employee);
        return new ResponseEntity<>(employee1,HttpStatus.OK);
    }

}
