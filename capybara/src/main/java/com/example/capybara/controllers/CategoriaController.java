package com.example.capybara.controllers;

import com.example.capybara.entities.Categoria;
import com.example.capybara.services.CategoriaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/categorias")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaServiceImpl> {

//    @GetMapping("/search")
//    public ResponseEntity<?> search(@RequestParam String filtro){
//        try{
//            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
//        }catch (Exception e){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
//        }
//    }
//
//    @GetMapping("/searchPaged")
//    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
//        try{
//            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
//        }catch (Exception e){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
//        }
//    }
}