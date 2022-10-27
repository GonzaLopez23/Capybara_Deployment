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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Carrito extends Base {


    private float totalCarrito;

    @OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinTable(
            joinColumns = @JoinColumn(name = "carrito_id"),
            inverseJoinColumns = @JoinColumn(name = "detalle_id")
    )
    private List<CarritoProductoDetalle> productoDetalles = new ArrayList<CarritoProductoDetalle>();
}
