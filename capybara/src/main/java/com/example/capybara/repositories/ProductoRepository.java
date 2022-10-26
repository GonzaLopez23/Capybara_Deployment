package com.example.capybara.repositories;

import com.example.capybara.entities.Producto;

public interface ProductoRepository extends BaseRepository<Producto, Long> {

//    @Query(value = "SELECT p FROM Producto p WHERE p.nombreProducto LIKE %:filtro% OR p.descripcion LIKE %:filtro%")
//    List<Producto> search(@Param("filtro") String filtro);
//
//    @Query(value = "SELECT p FROM Producto p WHERE p.nombreProducto LIKE %:filtro% OR p.descripcion LIKE %:filtro%")
//    Page<Producto> search(@Param("filtro") String filtro, Pageable pageable);


}
