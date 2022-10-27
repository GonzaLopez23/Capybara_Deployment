package com.example.capybara.repositories;

import com.example.capybara.entities.Carrito;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends BaseRepository<Carrito, Long> {

//    @Query(value = "SELECT c FROM Carrito c WHERE c.totalCarrito=:filtro")
//    List<Carrito> search(@Param("filtro") float filtro);
//
//    @Query(value = "SELECT c FROM Carrito c WHERE c.totalCarrito=:filtro")
//    Page<Carrito> search(@Param("filtro") float filtro, Pageable pageable);

}