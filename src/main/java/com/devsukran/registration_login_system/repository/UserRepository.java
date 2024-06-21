package com.devsukran.registration_login_system.repository;


import com.devsukran.registration_login_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
