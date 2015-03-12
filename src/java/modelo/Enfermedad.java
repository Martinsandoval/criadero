/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Tomi
 */
@Entity
@Table (name = "Enfermedad")
public class Enfermedad extends AbstractEntity <Enfermedad> implements Serializable {
    @Column(name="nombre")
    public String nombre;

    public Enfermedad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
