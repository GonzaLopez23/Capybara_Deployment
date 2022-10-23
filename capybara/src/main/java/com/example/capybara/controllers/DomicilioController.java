package com.example.capybara.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.capybara.entities.Domicilio;
import com.example.capybara.services.DomicilioServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilio")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>  {

    @GetMapping("/search_calle")
    public ResponseEntity<?> search(@RequestParam String filtro){

        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));

        } catch(Exception e){

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+"\"}");
        }

    }

    @GetMapping("/searchPaged_calle")
    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){

        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));

        } catch(Exception e){

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+"\"}");
        }

    }

    @GetMapping("/search_calle_numero")
    public ResponseEntity<?> search(@RequestParam String calle, @RequestParam int nro){

        try {

            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(calle, nro));

        } catch(Exception e){

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+"\"}");
        }

    }
}
