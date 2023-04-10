package com.Myproject.RewardPoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class RewardPointApplication{

	public static void main(String[] args) {
		SpringApplication.run(RewardPointApplication.class, args);
		System.out.println("Welcome There");
	}
	

}
