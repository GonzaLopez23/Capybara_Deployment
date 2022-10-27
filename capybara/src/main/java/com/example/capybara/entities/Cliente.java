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
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Cliente extends Base {

    private String nombre;

    private String apellido;

    private int dni;

    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_carrito")
    private Carrito carrito;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturasCliente = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    private Domicilio domicilio;
}
