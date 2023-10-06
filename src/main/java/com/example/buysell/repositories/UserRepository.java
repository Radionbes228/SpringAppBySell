package com.example.buysell.repositories;

import com.example.buysell.models.User;
import com.example.buysell.models.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
