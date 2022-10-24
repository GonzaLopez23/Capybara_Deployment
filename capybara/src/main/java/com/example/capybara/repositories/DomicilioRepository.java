package com.example.capybara.repositories;


import com.example.capybara.entities.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.capybara.entities.Domicilio;

import java.util.List;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {

    @Query(value = "SELECT d FROM Domicilio d WHERE d.calleDomicilio LIKE %:filtro%")
    List<Domicilio> search_calle(@Param("filtro") String filtro);

    @Query(value = "SELECT d FROM Domicilio d WHERE d.calleDomicilio LIKE %:filtro%")
    Page<Domicilio> search_calle(@Param("filtro") String filtro, Pageable pageable);

    @Query(value = "SELECT d FROM Domicilio d WHERE d.calleDomicilio LIKE %:calle% AND d.numeroDomicilio = :nro")
    List<Domicilio> search_calle_numero(@Param("calle") String calle, @Param("nro") int nro);

}
