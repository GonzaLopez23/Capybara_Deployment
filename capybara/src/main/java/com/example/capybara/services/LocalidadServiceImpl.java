package com.example.capybara.services;

import com.example.capybara.entities.Localidad;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {super(baseRepository);}
}
