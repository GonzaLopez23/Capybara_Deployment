package com.example.capybara.services;

import com.example.capybara.entities.Categoria;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) {
        super(baseRepository, Categoria.class);
    }
}
