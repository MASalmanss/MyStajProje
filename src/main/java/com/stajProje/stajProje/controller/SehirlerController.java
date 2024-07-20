package com.stajProje.stajProje.controller;

import com.stajProje.stajProje.entity.Sehirler;
import com.stajProje.stajProje.service.SehirlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SehirlerController {

    @Autowired
    SehirlerService sehirlerService;

    @GetMapping("/sehirler")
    public List<Sehirler> findList(@RequestParam int no , @RequestParam int size){
        return sehirlerService.findAll(no , size);
    }
}
