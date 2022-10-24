package com.example.capybara.services;

import com.example.capybara.entities.CarritoProductoDetalle;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.CarritoProductoDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoProductoDetalleServiceImpl extends BaseServiceImpl<CarritoProductoDetalle, Long> implements CarritoProductoDetalleService {
    @Autowired
    private CarritoProductoDetalleRepository carritoProductoDetalleRepository;

    public CarritoProductoDetalleServiceImpl(BaseRepository<CarritoProductoDetalle, Long> baseRepository) {
        super(baseRepository, CarritoProductoDetalle.class);
    }
}
