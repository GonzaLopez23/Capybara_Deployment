package com.example.capybara.controlers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.capybara.entities.Cliente;
import com.example.capybara.services.ClienteServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/clientes")
public class ClienteRespository extends BaseControllerImpl<Cliente, ClienteServiceImpl>  {
}
