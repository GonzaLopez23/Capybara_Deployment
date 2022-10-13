package org.example.repositories;

import org.example.entities.Cliente;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long> {

}