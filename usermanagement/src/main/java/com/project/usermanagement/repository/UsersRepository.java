package com.project.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.usermanagement.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    boolean existsByMobile(String mobile);
}
