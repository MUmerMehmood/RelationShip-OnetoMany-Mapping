package com.relationship.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OnetoManyRelation2Application {

	public static void main(String[] args) {
		SpringApplication.run(OnetoManyRelation2Application.class, args);
	}

}
