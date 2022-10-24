package com.example.capybara.repositories;

import com.example.capybara.entities.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends BaseRepository<Factura, Long> {

    @Query(value = "SELECT f FROM Factura f WHERE f.numeroFactura = :filtro")
    Page<Factura> search(@Param("filtro") Integer filtro, Pageable pageable);

}
