package com.example.capybara.services;

import com.example.capybara.entities.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoriaService extends BaseService<Categoria, Long> {

    List<Categoria> search(String filtro) throws Exception;

    Page<Categoria> search(String filtro, Pageable pageable) throws Exception;
}
