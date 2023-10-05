package com.castilhocorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castilhocorp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
