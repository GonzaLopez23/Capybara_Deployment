package com.example.capybara.services;

import com.example.capybara.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProductoService extends BaseService<Producto, Long>{

    List<Producto> search(String filtro) throws Exception;


    Page<Producto> search(String filtro, Pageable pageable) throws Exception;
}
