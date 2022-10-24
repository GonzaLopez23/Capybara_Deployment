package com.example.capybara.services;

import com.example.capybara.entities.FacturaDetalle;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.FacturaDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacturaDetalleServiceImpl extends BaseServiceImpl<FacturaDetalle, Long> implements FacturaDetalleService {

    @Autowired
    private FacturaDetalleRepository facturaDetalleRepository;

    public FacturaDetalleServiceImpl(BaseRepository<FacturaDetalle, Long> baseRepository) {
        super(baseRepository);
    }


    @Override
    public Page<FacturaDetalle> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<FacturaDetalle> facturaDetalles = facturaDetalleRepository.search(filtro, pageable);
            return facturaDetalles;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}
