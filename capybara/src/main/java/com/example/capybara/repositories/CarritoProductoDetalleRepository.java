package com.example.capybara.repositories;

import com.example.capybara.entities.CarritoProductoDetalle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoProductoDetalleRepository extends BaseRepository<CarritoProductoDetalle, Long> {

    @Query(value = "SELECT cpd FROM CarritoProductoDetalle cpd WHERE cpd.cantidadCarritoProductoDetalle=:filtro")
    Page<CarritoProductoDetalle> search(@Param("filtro") float filtro, Pageable pageable);
}
