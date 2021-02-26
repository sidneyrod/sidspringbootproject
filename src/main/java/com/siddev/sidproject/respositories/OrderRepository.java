package com.siddev.sidproject.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddev.sidproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
