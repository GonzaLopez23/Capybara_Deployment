package com.example.capybara.services;

import com.example.capybara.entities.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FacturaService extends BaseService<Factura, Long> {


    Page<Factura> search(Integer filtro, Pageable pageable) throws Exception;

}
