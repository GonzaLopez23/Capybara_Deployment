package com.example.capybara.services;

import com.example.capybara.entities.Producto;

import java.util.List;

public interface ProductoService extends BaseService<Producto, Long>{

    List<Producto> search(String filtro) throws Exception;
}
