package com.stajProje.stajProje.service;

import com.stajProje.stajProje.entity.Sehirler;
import com.stajProje.stajProje.repository.SehirlerRepository;

import java.util.List;

public interface SehirlerService {



    List<Sehirler> findAll(int size , int no);
}
