package com.siddev.sidproject.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddev.sidproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
