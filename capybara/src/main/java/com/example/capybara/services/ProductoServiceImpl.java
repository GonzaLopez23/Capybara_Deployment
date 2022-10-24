package com.example.capybara.services;

import com.example.capybara.entities.Producto;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto, Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Producto> search(String filtro) throws Exception {
        try{
            List<Producto> productos = productoRepository.search(filtro);
            return productos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Producto> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Producto> productos = productoRepository.search(filtro, pageable);
            return productos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
