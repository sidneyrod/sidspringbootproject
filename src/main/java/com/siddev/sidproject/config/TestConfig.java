package com.siddev.sidproject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.siddev.sidproject.entities.User;
import com.siddev.sidproject.respositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Bruno Ferreira", "bruno@gmail.com", "991111111", "123456");
		User u2 = new User(null, "Mirian Rodrigues", "mirian@gmail.com", "992222222", "123456");

		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
}
