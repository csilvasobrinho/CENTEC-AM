package com.blomaq.ctrlAbastecimento.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.blomaq.ctrlAbastecimento.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig {
	
	@Autowired
	private UserRepository userRepository;

}
