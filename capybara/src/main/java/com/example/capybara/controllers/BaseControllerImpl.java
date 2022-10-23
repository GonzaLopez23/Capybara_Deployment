package com.example.capybara.controllers;

import com.example.capybara.common.FilterRequest;
import com.example.capybara.common.SearchRequest;
import com.example.capybara.common.SortRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.capybara.entities.Base;

import java.util.List;

public abstract class BaseControllerImpl<E extends Base, S extends com.example.capybara.services.BaseServiceImpl<E, Long>> implements BaseController<E, Long>{

    @Autowired
    protected S servicio;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());

        } catch(Exception e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @GetMapping("/paged")
    public ResponseEntity<?> getAll(Pageable pageable){
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll(pageable));

        } catch(Exception e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(
            @RequestParam List<FilterRequest> filters,
            @RequestParam List<SortRequest> sorts,
            @RequestParam Integer page,
            @RequestParam Integer size
    ){
        try {
            SearchRequest searchRequest = new SearchRequest(filters, sorts, page, size);

            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(searchRequest));

        } catch(Exception e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));

        } catch(Exception e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));

        } catch(Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity){
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));

        } catch(Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try {

            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));

        } catch(Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

}
