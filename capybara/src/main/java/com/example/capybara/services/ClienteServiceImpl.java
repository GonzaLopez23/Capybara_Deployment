package com.example.capybara.services;

import com.example.capybara.entities.Cliente;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository) {
        super(baseRepository, Cliente.class);
    }

//    @Override
//    public List<Cliente> search(String filtro) throws Exception {
//
//        try {
//
//            List<Cliente> clientes = clienteRepository.search_nombre(filtro);
//            return clientes;
//
//        } catch(Exception e) {
//
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    public Page<Cliente> search(String filtro, Pageable pageable) throws Exception {
//
//        try {
//
//            Page<Cliente> clientes = clienteRepository.search_nombre(filtro, pageable);
//            return clientes;
//
//        } catch(Exception e) {
//
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    public List<Cliente> search(int filtro) throws Exception {
//
//        try {
//
//            List<Cliente> clientes = clienteRepository.search_dni(filtro);
//            return clientes;
//
//        } catch(Exception e) {
//
//            throw new Exception(e.getMessage());
//        }
//    }

}
