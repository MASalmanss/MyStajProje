package com.stajProje.stajProje.service.business;

import com.stajProje.stajProje.dto.LocationDto;
import com.stajProje.stajProje.entity.Location;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {
    private final RestTemplate restTemplate;

    public RestTemplateService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public LocationDto getExample(){
        String url = "http://ip-api.com/json/24.48.0.1";
        return restTemplate.getForObject(url , LocationDto.class);
    }


}
