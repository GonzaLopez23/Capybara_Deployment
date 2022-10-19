package com.example.capybara.services;

import com.example.capybara.entities.Carrito;
import com.example.capybara.repositories.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.capybara.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class CarritoServiceImpl extends BaseServiceImpl<Carrito, Long> implements CarritoService{

    @Autowired
    private CarritoRepository carritoRepository;

    public CarritoServiceImpl(BaseRepository<Carrito, Long> baseRepository){
        super(baseRepository);
    }
}
