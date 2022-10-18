package com.example.capybara.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.capybara.entities.Domicilio;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.DomicilioRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository){
        super(baseRepository);
    }
}
