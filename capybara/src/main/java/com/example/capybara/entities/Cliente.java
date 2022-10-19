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
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Cliente extends Base{

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "apellido_cliente")
    private String apellidoCliente;

    @Column(name = "dni_cliente")
    private int dniCliente;

    @Column(name = "email_cliente")
    private String emailCliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_carrito")
    private Carrito carrito;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturasCliente = new ArrayList<Factura>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilio_cliente")
    private Domicilio  domicilio;
}
