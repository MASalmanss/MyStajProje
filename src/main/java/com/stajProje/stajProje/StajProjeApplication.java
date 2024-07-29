package com.stajProje.stajProje;

import com.stajProje.stajProje.dto.LocationDto;
import com.stajProje.stajProje.dto.LocationMapper;
import com.stajProje.stajProje.entity.Location;
import com.stajProje.stajProje.repository.LocationRepository;
import com.stajProje.stajProje.service.business.RestTemplateService;
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
	CommandLineRunner commandLineRunner(RestTemplateService restTemplateService , LocationMapper locationMapper , LocationRepository locationRepository){
		return result ->{
			LocationDto temp = restTemplateService.getExample();
			Location location = locationMapper.LocationDtoToLocation(temp);
			locationRepository.save(location);
			System.out.println(temp.toString());
			System.out.println(location.toString());

		};
	}

}
