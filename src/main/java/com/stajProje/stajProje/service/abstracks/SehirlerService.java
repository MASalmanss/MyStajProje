package com.stajProje.stajProje.service.abstracks;

import com.stajProje.stajProje.entity.Sehirler;

import java.util.List;

public interface SehirlerService {



    List<Sehirler> findAll(int size , int no);
}
