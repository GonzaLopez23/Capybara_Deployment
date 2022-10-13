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
@Table(name="carrito")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Carrito extends Base{

    @Column(name = "total_carrito")
    private float totalCarrito;

}
