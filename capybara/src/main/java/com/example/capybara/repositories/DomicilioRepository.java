package com.example.capybara.repositories;


import com.example.capybara.entities.Domicilio;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {

//    @Query(value = "SELECT d FROM Domicilio d WHERE d.calleDomicilio LIKE %:filtro%")
//    List<Domicilio> search_calle(@Param("filtro") String filtro);
//
//    @Query(value = "SELECT d FROM Domicilio d WHERE d.calleDomicilio LIKE %:filtro%")
//    Page<Domicilio> search_calle(@Param("filtro") String filtro, Pageable pageable);
//
//    @Query(value = "SELECT d FROM Domicilio d WHERE d.calleDomicilio LIKE %:calle% AND d.numeroDomicilio = :nro")
//    List<Domicilio> search_calle_numero(@Param("calle") String calle, @Param("nro") int nro);

}
