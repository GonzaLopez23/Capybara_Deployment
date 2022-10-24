package com.example.capybara.services;

import com.example.capybara.entities.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClienteService extends BaseService<Cliente, Long> {

    public List<Cliente> search(String filtro) throws Exception;
    public Page<Cliente> search(String filtro, Pageable pageable) throws Exception;
    public List<Cliente> search(int filtro) throws Exception;
//    public Page<Cliente> search(String filtro, Pageable pageable) throws Exception;
}