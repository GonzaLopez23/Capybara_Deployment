package com.example.capybara.repositories;

import com.example.capybara.entities.FacturaDetalle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaDetalleRepository extends BaseRepository<FacturaDetalle, Long> {
    
    @Query(value = "SELECT f FROM FacturaDetalle f WHERE f.producto.nombreProducto LIKE %:filtro%")
    Page<FacturaDetalle> search(@Param("filtro") String filtro, Pageable pageable);

}
