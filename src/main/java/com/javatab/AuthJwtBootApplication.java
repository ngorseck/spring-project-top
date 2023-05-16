package com.javatab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@SpringBootApplication
public class AuthJwtBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthJwtBootApplication.class, args);
	}
	/**
	 * http://localhost:9000/api/swagger-ui/index.html
	 * http://localhost:9000/api/users
	 * http://localhost:9000/api/auth/register
	 * http://localhost:9000/api/api-docs
	 */
}
