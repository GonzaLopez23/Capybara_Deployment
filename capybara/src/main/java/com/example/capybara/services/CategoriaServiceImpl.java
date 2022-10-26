package com.example.capybara.services;

import com.example.capybara.entities.Categoria;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) {
        super(baseRepository, Categoria.class);
    }

    @Override
    public List<Categoria> search(String filtro) throws Exception {
        try{
            List<Categoria> categorias = categoriaRepository.search(filtro);
            return categorias;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Categoria> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Categoria> categorias = categoriaRepository.search(filtro, pageable);
            return categorias;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
