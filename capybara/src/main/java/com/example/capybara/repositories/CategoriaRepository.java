package com.example.capybara.repositories;

import com.example.capybara.entities.Categoria;
import com.example.capybara.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long> {

    @Query(value = "SELECT c FROM Categoria c WHERE c.nombreCategoria LIKE %:filtro% OR c.descripcionCategoria LIKE %:filtro%")
    List<Categoria> search(@Param("filtro") String filtro);

    @Query(value = "SELECT c FROM Categoria c WHERE c.nombreCategoria LIKE %:filtro% OR c.descripcionCategoria LIKE %:filtro%")
    Page<Categoria> search(@Param("filtro") String filtro, Pageable pageable);
}