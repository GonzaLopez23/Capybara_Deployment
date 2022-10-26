package com.example.capybara.repositories;

import com.example.capybara.entities.Localidad;

public interface LocalidadRepository extends BaseRepository<Localidad, Long> {

//    @Query(value = "SELECT l FROM Localidad l WHERE l.denominacion LIKE %:filtro%")
//    Page<Localidad> search(@Param("filtro") String filtro, Pageable pageable);
}
