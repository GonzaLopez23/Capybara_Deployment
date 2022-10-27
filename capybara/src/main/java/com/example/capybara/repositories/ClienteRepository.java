package com.example.capybara.repositories;


import com.example.capybara.entities.Cliente;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long> {

//    @Query(value = "SELECT c FROM Cliente c WHERE c.nombreCliente LIKE %:filtro% OR c.apellidoCliente LIKE %:filtro%")
//    List<Cliente> search_nombre(@Param("filtro") String filtro);
//
//    @Query(value = "SELECT c FROM Cliente c WHERE c.nombreCliente LIKE %:filtro% OR c.apellidoCliente LIKE %:filtro%")
//    Page<Cliente> search_nombre(@Param("filtro") String filtro, Pageable pageable);
//
//    @Query(value = "SELECT c FROM Cliente c WHERE c.dniCliente = :filtro")
//    List<Cliente> search_dni(@Param("filtro") int filtro);

}