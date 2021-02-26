package com.siddev.sidproject.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddev.sidproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
