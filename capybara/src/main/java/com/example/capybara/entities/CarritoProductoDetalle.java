package com.example.capybara.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "carrito_producto_detalle")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class CarritoProductoDetalle extends Base{

    @Column(name = "cantidad_carrito_producto_detalle")
    private int cantidadCarritoProductoDetalle;

    @Column(name = "subtotal_carrito_producto_detalle")
    private float subtotalCarritoProductoDetalle;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "carrito_producto_detalle_productos")
    private Producto producto;
}
