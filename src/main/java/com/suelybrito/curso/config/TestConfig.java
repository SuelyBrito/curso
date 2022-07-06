package com.suelybrito.curso.config;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;

import com.suelybrito.curso.entities.User;
import com.suelybrito.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	@GetMapping
	public void run(String... args) throws Exception {
		User u1 = new User( 0, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(0, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(0, "Mia Silva ", "mias@gmail.com", "88888888", "123456");
		userRepository.saveAll(Arrays.asList(u1, u2,u3)); 
	}

}
