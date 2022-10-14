package com.example.capybara.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.capybara.entities.Cliente;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.ClienteRepository;

public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository){
        super(baseRepository);
    }
}
