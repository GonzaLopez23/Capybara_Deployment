package com.example.capybara.services;

import com.example.capybara.entities.Carrito;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CarritoService extends BaseService<Carrito, Long> {
    List<Carrito> search(float filtro) throws Exception;


    Page<Carrito> search(float filtro, Pageable pageable) throws Exception;
}
