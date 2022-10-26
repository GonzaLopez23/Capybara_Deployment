package com.example.capybara.services;

import com.example.capybara.entities.Factura;
import com.example.capybara.repositories.BaseRepository;
import com.example.capybara.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
        super(baseRepository, Factura.class);
    }


//    @Override
//    public Page<Factura> search(Integer filtro, Pageable pageable) throws Exception {
//        try {
//            Page<Factura> facturas = facturaRepository.search(filtro, pageable);
//            return facturas;
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
}
