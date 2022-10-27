package com.example.capybara.repositories;

import com.example.capybara.entities.FacturaDetalle;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaDetalleRepository extends BaseRepository<FacturaDetalle, Long> {

//    @Query(value = "SELECT f FROM FacturaDetalle f WHERE f.producto.nombreProducto LIKE %:filtro%")
//    Page<FacturaDetalle> search(@Param("filtro") String filtro, Pageable pageable);

}
