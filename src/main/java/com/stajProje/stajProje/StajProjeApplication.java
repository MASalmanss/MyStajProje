package com.stajProje.stajProje;

import com.stajProje.stajProje.service.RestTemplateService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StajProjeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StajProjeApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(RestTemplateService restTemplateService){
		return result ->{
			String deneme = restTemplateService.getExample();
			System.out.println(deneme);
		};
	}

}
