package com.example.capybara.repositories;



import org.springframework.stereotype.Repository;

import com.example.capybara.entities.Cliente;


@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long> {

}