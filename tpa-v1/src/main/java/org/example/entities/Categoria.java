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
@Table(name = "categoria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Categoria extends Base{

    @Column(name = "nombre_categoria")
    private String nombreCategoria;

    @Column(name = "descripcion_categoria")
    private String descripcionCategoria;
}
