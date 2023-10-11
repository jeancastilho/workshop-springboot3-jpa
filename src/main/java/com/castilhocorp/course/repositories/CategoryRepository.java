package com.castilhocorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castilhocorp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
