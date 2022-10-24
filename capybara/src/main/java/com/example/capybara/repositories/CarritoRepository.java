package com.example.capybara.repositories;

import com.example.capybara.entities.Carrito;
import com.example.capybara.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarritoRepository extends BaseRepository<Carrito, Long> {

    @Query(value = "SELECT c FROM Carrito c WHERE c.totalCarrito=:filtro")
    List<Carrito> search(@Param("filtro") String filtro);

    @Query(value = "SELECT c FROM Carrito c WHERE c.totalCarrito=:filtro")
    Page<Carrito> search(@Param("filtro") String filtro, Pageable pageable);

}