package com.example.capybara.controllers;

import com.example.capybara.common.search.SearchCriteria;
import com.example.capybara.entities.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BaseControllerImpl<E extends Base, S extends com.example.capybara.services.BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

    @Autowired
    protected S servicio;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @GetMapping("/paged")
    public ResponseEntity<?> getAll(Pageable pageable) {
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll(pageable));

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity) {
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity) {
        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {

            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }


    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(value = "search", required = false) String search) {
        try {

            List<SearchCriteria> params = new ArrayList<SearchCriteria>();
            if (search != null) {
                Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),");
                Matcher matcher = pattern.matcher(search + ",");
                while (matcher.find()) {
                    params.add(new SearchCriteria(matcher.group(1), matcher.group(2), matcher.group(3)));
                }
            }

            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(params));

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");

        }
    }


}
