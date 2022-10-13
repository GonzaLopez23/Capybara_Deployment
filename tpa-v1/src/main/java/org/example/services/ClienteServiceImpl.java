package org.example.services;

import org.example.entities.Cliente;
import org.example.repositories.BaseRepository;
import org.example.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository){
        super(baseRepository);
    }
}
