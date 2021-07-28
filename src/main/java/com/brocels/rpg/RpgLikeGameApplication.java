package com.brocels.rpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class RpgLikeGameApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RpgLikeGameApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(RpgLikeGameApplication.class);
		builder.headless(false);
		builder.run(args);
	}

}
