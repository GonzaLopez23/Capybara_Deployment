package com.example.capybara.repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.capybara.entities.Cliente;

import java.util.List;


@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long> {

    @Query(value = "SELECT c FROM Cliente c WHERE c.nombreCliente LIKE %:filtro% OR c.apellidoCliente LIKE %:filtro%")
    List<Cliente> search_nombre(@Param("filtro") String filtro);

    @Query(value = "SELECT c FROM Cliente c WHERE c.nombreCliente LIKE %:filtro% OR c.apellidoCliente LIKE %:filtro%")
    Page<Cliente> search_nombre(@Param("filtro") String filtro, Pageable pageable);

    @Query(value = "SELECT c FROM Cliente c WHERE c.dniCliente = :filtro")
    List<Cliente> search_dni(@Param("filtro") int filtro);

}