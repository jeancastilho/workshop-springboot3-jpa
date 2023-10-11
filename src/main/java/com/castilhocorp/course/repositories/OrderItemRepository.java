package com.castilhocorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castilhocorp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
