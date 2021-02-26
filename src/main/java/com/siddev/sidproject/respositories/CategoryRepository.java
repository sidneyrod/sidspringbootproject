package com.siddev.sidproject.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddev.sidproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
