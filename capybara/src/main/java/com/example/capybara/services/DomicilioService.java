package com.example.capybara.services;

import com.example.capybara.entities.Cliente;
import com.example.capybara.entities.Domicilio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DomicilioService extends BaseService<Domicilio, Long>  {

    List<Domicilio> search(String filtro) throws Exception;

    Page<Domicilio> search(String filtro, Pageable pageable) throws Exception;

    List<Domicilio> search(String calle, int nro) throws Exception;
}
