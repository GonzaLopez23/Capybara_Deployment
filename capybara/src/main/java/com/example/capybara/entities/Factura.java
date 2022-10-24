package com.example.capybara.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "factura")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Factura extends Base {

    @Column(name = "numero_factura")
    private int numeroFactura;

    private float total;

    @OneToMany(cascade = CascadeType.DETACH, orphanRemoval = true)
    private List<FacturaDetalle> detalles = new ArrayList<>();
}
