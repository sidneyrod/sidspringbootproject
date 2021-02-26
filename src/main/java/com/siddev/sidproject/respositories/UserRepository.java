package com.siddev.sidproject.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddev.sidproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
