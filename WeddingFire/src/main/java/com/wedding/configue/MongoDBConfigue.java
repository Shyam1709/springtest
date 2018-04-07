package com.wedding.configue;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.wedding.repository.EnquiryFormRepository;
import com.wedding.repository.MehndiRepository;

@EnableMongoRepositories(basePackages = "com.wedding.repository")
@Configuration
public class MongoDBConfigue {
	@Bean
	CommandLineRunner commandLineRunner(MehndiRepository mehndiRepository, EnquiryFormRepository enquiryRepository) {
		return null;
	}
}
