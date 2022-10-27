package com.example.capybara.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class FacturaDetalle extends Base {

    private int cantidad;

    private float subtotal;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "fk_producto")
    private Producto producto;


}
