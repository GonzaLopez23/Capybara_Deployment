package com.example.capybara.repositories;

import com.example.capybara.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepository extends BaseRepository<Producto, Long> {

    @Query(value = "SELECT p FROM Producto p WHERE p.nombreProducto LIKE %:filtro% OR p.descripcion LIKE %:filtro%")
    List<Producto> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Producto p WHERE p.nombreProducto LIKE %:filtro% OR p.descripcion LIKE %:filtro%")
    Page<Producto> search(@Param("filtro") String filtro, Pageable pageable);


}
