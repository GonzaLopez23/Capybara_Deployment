package com.example.capybara.repositories;

import com.example.capybara.entities.Producto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepository extends BaseRepository<Producto, Long> {

    @Query(
            value ="SELECT * FROM producto WHERE producto.nombre_producto LIKE %:filtro% OR producto.descripcion LIKE %:filtro%",
            nativeQuery = true
    )
    List<Producto> searchNativo(String filtro);
}
