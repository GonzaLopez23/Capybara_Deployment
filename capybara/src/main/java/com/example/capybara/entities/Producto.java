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
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Producto extends Base {

    private String nombre;

    private String descripcion;

    private int cantidad;

    private float precio;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "fk_categoria")
    private Categoria categoria;


}
