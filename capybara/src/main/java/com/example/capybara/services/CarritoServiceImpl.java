package com.example.capybara.services;

import com.example.capybara.entities.Carrito;
import com.example.capybara.entities.Producto;
import com.example.capybara.repositories.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.capybara.repositories.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoServiceImpl extends BaseServiceImpl<Carrito, Long> implements CarritoService{

    @Autowired
    private CarritoRepository carritoRepository;

    public CarritoServiceImpl(BaseRepository<Carrito, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Carrito> search(float filtro) throws Exception {
        try{
            List<Carrito> carritos = carritoRepository.search(filtro);
            return carritos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Carrito> search(float filtro, Pageable pageable) throws Exception {
        try{
            Page<Carrito> carritos = carritoRepository.search(filtro, pageable);
            return carritos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
