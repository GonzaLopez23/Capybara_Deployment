package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "factura_detalle")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class FacturaDetalle extends Base{

    @Column(name = "cantidad_factura_detalle")
    private int cantidadFacturaDetalle;

    @Column(name = "subtotal_factura_detalle")
    private float subtotalFacturaDetalle;
}
