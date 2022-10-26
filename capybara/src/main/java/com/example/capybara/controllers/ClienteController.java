package com.example.capybara.controllers;

import com.example.capybara.entities.Cliente;
import com.example.capybara.services.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl> {

//    @GetMapping("/search_nombre")
//    public ResponseEntity<?> search(@RequestParam String filtro){
//
//        try {
//
//            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
//
//        } catch(Exception e){
//
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+"\"}");
//        }
//
//    }
//
//    @GetMapping("/searchPaged_nombre")
//    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
//
//        try {
//
//            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
//
//        } catch(Exception e){
//
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+"\"}");
//        }
//
//    }
//
//    @GetMapping("/search_dni")
//    public ResponseEntity<?> search(@RequestParam int filtro){
//
//        try {
//
//            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
//
//        } catch(Exception e){
//
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \""+e.getMessage()+"\"}");
//        }
//
//    }
}
