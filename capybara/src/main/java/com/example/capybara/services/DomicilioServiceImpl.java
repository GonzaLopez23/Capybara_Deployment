package com.example.capybara.services;

import com.example.capybara.entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.capybara.entities.Domicilio;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.DomicilioRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Domicilio> search(String filtro) throws Exception {

        try {

            List<Domicilio> domicilios = domicilioRepository.search_calle(filtro);
            return domicilios;

        } catch(Exception e) {

            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Domicilio> search(String filtro, Pageable pageable) throws Exception {

        try {

            Page<Domicilio> domicilios = domicilioRepository.search_calle(filtro, pageable);
            return domicilios;

        } catch(Exception e) {

            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Domicilio> search(String calle, int nro) throws Exception {

        try {

            List<Domicilio> domicilios = domicilioRepository.search_calle_numero(calle, nro);
            return domicilios;

        } catch(Exception e) {

            throw new Exception(e.getMessage());
        }
    }
}
