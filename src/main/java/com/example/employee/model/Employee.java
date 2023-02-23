//package com.example.employee.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name="employee_details")
//public class Employee {
//
//    @Id
//    @Column(name="id")
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name="salary")
//    private double salary;
//
//    @Column(name = "email_id")
//    private String emailId;
//
//    @Column(name = "department")
//    private String department;
//
//    @Column(name = "date_of_joining")
//    private LocalDate dateOfJoining;
//
//    @Column(name = "created_by")
//    private String createdBy;
//
//    @Column(name = "created_date")
//    private LocalDateTime createdDate;
//
//    @Column(name = "last_updated_by")
//    private String lastUpdatedBy;
//
//    @Column(name = "last_updated_date")
//    private LocalDateTime lastUpdatedDate;
//
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public String getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(String createdBy) {
//        this.createdBy = createdBy;
//    }
//
//    public LocalDateTime getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(LocalDateTime createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public String getLastUpdatedBy() {
//        return lastUpdatedBy;
//    }
//
//    public void setLastUpdatedBy(String lastUpdatedBy) {
//        this.lastUpdatedBy = lastUpdatedBy;
//    }
//
//    public LocalDateTime getLastUpdatedDate() {
//        return lastUpdatedDate;
//    }
//
//    public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
//        this.lastUpdatedDate = lastUpdatedDate;
//    }
//
//    public String getEmailId() {
//        return emailId;
//    }
//
//    public void setEmailId(String emailId) {
//        this.emailId = emailId;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public LocalDate getDateOfJoining() {
//        return dateOfJoining;
//    }
//
//    public void setDateOfJoining(LocalDate dateOfJoining) {
//        this.dateOfJoining = dateOfJoining;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                ", emailId='" + emailId + '\'' +
//                ", department='" + department + '\'' +
//                ", dateOfJoining=" + dateOfJoining +
//                ", createdBy='" + createdBy + '\'' +
//                ", createdDate=" + createdDate +
//                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
//                ", lastUpdatedDate=" + lastUpdatedDate +
//                '}';
//    }
//
//}
