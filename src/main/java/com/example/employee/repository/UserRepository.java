package com.example.employee.repository;


import com.example.employee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
    @Query("SELECT user FROM User user where user.username=:username AND user.password=:password")
    User getUser(@Param("username") String username,@Param("password") String password);
}
