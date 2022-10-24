package com.example.capybara.services;

import com.example.capybara.entities.FacturaDetalle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FacturaDetalleService extends BaseService<FacturaDetalle, Long> {

    Page<FacturaDetalle> search(String filtro, Pageable pageable) throws Exception;
}
