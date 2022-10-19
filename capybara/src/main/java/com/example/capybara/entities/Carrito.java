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
@Table(name="carrito")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Carrito extends Base{

    @Column(name = "total_carrito")
    private float totalCarrito;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "carrito_carrito_detalle",
            joinColumns = @JoinColumn(name = "carrito_id"),
            inverseJoinColumns = @JoinColumn(name = "detalle_id")
    )
    private List<CarritoProductoDetalle> productoDetalles= new ArrayList<CarritoProductoDetalle>();
}
