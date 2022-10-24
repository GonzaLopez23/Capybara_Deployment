package com.example.capybara.repositories;

import com.example.capybara.entities.Localidad;
import com.example.capybara.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocalidadRepository extends BaseRepository<Localidad, Long> {

    @Query(value = "SELECT l FROM Localidad l WHERE l.denominacion LIKE %:filtro%")
    Page<Localidad> search(@Param("filtro") String filtro, Pageable pageable);
}
