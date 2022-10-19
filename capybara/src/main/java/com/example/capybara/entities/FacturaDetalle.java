package com.example.capybara.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "factura_detalle")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class FacturaDetalle extends Base{

    private int cantidad;

    private float subtotal;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "fk_producto")
    private Producto producto;

}
