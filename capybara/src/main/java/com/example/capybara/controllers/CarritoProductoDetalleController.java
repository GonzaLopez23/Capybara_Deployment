package com.example.capybara.controllers;

import com.example.capybara.entities.CarritoProductoDetalle;
import com.example.capybara.services.CarritoProductoDetalleServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/carritoproductodetalles")
public class CarritoProductoDetalleController extends BaseControllerImpl<CarritoProductoDetalle, CarritoProductoDetalleServiceImpl>{
}
