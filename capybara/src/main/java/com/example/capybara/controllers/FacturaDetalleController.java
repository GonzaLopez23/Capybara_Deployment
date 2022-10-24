package com.example.capybara.controllers;

import com.example.capybara.entities.FacturaDetalle;
import com.example.capybara.services.FacturaDetalleServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/factura_detalle")
public class FacturaDetalleController extends BaseControllerImpl<FacturaDetalle, FacturaDetalleServiceImpl>  {
}
