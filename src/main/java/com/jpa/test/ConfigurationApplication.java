package com.jpa.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ConfigurationApplication implements CommandLineRunner{
@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigurationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO users (name,email,gender) VALUES (?,?,?)";
		int result = jdbcTemplate.update(sql,"chittu","chi.you@gmail.com","male");
		int result1 = jdbcTemplate.update(sql,"rock","rock.you@gmail.com","male");
		
		
		
		if (result > 0) {
			System.out.println("Data has been Inserted Successfully");
		}
	}

}
