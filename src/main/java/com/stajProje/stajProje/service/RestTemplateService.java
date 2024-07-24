package com.stajProje.stajProje.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {
    private final RestTemplate restTemplate;

    public RestTemplateService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getExample(){
        String url = "https://restcountries.com/v3.1/name/deutschland";
        return restTemplate.getForObject(url , String.class);
    }


}
