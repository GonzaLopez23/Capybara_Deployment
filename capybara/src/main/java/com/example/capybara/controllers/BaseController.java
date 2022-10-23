package com.example.capybara.controllers;

import com.example.capybara.common.FilterRequest;
import com.example.capybara.common.SearchRequest;
import com.example.capybara.common.SortRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.capybara.entities.Base;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.util.List;

public interface BaseController <E extends Base,ID extends Serializable> {

    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getAll(Pageable pageable);
    public ResponseEntity<?> search( @RequestParam List<FilterRequest> filters,
                                     @RequestParam List<SortRequest> sorts,
                                     @RequestParam Integer page,
                                     @RequestParam Integer size); //TODO fix peliaguda part
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);

}