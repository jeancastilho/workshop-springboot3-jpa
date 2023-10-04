package com.castilhocorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castilhocorp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
