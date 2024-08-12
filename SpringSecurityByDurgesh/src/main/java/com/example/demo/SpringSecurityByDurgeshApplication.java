package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@SpringBootApplication
public class SpringSecurityByDurgeshApplication implements CommandLineRunner
{
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityByDurgeshApplication.class, args);
		System.out.println("welcome to spring boot by durgesh...");
		System.out.println("added this project to git account poojatungatkar68@gmail.com and password is Pooja.git@123");
	}

	@Override
	public void run(String... args) throws Exception
	{
//		User u1=new User();
//		u1.setUsername("prisha");
//		u1.setEmail("prisha@123");
//		u1.setPassword(bCryptPasswordEncoder.encode("prisha123"));
//		u1.setRole("ROLE_NORMAL");
//		this.repo.save(u1);
//		
//		User u2=new User();
//		u2.setUsername("yogesh");
//		u2.setEmail("yogesh@123");
//		u2.setPassword(bCryptPasswordEncoder.encode("yogesh123"));
//		u2.setRole("ROLE_ADMIN");
//		this.repo.save(u2);
	}

}
