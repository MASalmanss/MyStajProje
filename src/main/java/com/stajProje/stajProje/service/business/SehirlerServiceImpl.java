package com.stajProje.stajProje.service.business;

import com.stajProje.stajProje.entity.Sehirler;
import com.stajProje.stajProje.repository.SehirlerRepository;
import com.stajProje.stajProje.service.abstracks.SehirlerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SehirlerServiceImpl implements SehirlerService {

    private final SehirlerRepository sehirlerRepository;

    public SehirlerServiceImpl(SehirlerRepository sehirlerRepository) {
        this.sehirlerRepository = sehirlerRepository;
    }

    @Override
    public List<Sehirler> findAll(int no , int size) {
        PageRequest pageable = PageRequest.of(no , size);
        Page<Sehirler> sehirlerPage = sehirlerRepository.findAll(pageable);
        return sehirlerPage.toList();
    }
}
