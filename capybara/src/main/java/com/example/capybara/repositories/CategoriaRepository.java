package com.example.capybara.repositories;

import com.example.capybara.entities.Categoria;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long> {

//    @Query(value = "SELECT c FROM Categoria c WHERE c.nombreCategoria LIKE %:filtro% OR c.descripcionCategoria LIKE %:filtro%")
//    List<Categoria> search(@Param("filtro") String filtro);
//
//    @Query(value = "SELECT c FROM Categoria c WHERE c.nombreCategoria LIKE %:filtro% OR c.descripcionCategoria LIKE %:filtro%")
//    Page<Categoria> search(@Param("filtro") String filtro, Pageable pageable);
}