package com.example.capybara.controllers;

import com.example.capybara.entities.Carrito;
import com.example.capybara.services.CarritoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/carritos")
public class CarritoController extends BaseControllerImpl<Carrito, CarritoServiceImpl>{
}
