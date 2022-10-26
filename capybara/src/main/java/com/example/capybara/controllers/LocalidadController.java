package com.example.capybara.controllers;


import com.example.capybara.entities.Localidad;
import com.example.capybara.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {

//    @GetMapping("/searchPaged")
//    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
//        try{
//            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
//        }catch (Exception e){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
//        }
//    }
}
