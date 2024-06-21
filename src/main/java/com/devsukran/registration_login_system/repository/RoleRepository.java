package com.devsukran.registration_login_system.repository;

import com.devsukran.registration_login_system.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
