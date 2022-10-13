package org.example.services;

import org.example.entities.Cliente;
import org.example.entities.Domicilio;
import org.example.repositories.BaseRepository;
import org.example.repositories.ClienteRepository;
import org.example.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository){
        super(baseRepository);
    }
}
