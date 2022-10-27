package com.example.capybara.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Factura extends Base {

    private int numero;

    private float total;

    @OneToMany(cascade = CascadeType.DETACH, orphanRemoval = true)
    private List<FacturaDetalle> detalles = new ArrayList<>();
}
