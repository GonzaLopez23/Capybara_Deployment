package com.example.capybara.services;

import com.example.capybara.entities.CarritoProductoDetalle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarritoProductoDetalleService extends BaseService<CarritoProductoDetalle, Long>{

    Page<CarritoProductoDetalle> search(String filtro, Pageable pageable) throws Exception;

}
