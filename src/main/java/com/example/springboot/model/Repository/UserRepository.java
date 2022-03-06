package com.example.springboot.model.Repository;
import com.example.springboot.model.Entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserData, Long> {
}
