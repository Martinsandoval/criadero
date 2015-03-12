/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Tomi
 */
@Entity
@Table (name = "Enfermedad")
public class Cerdo extends AbstractEntity <Cerdo> implements Serializable {
    @OneToMany(mappedBy = "enfermedad")
    private ArrayList<Enfermedad> enfermedad;
    @OneToMany (mappedBy ="vacuna")
    private ArrayList<Vacuna> vacunas;
    @OneToOne(mappedBy = "galpon")
    private Galpon galpon;
    @Column(name="peso")
    private float peso;
    
    
    
    
    
    public Cerdo() {
    }

    public ArrayList<Enfermedad> getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(ArrayList<Enfermedad> enfermedad) {
        this.enfermedad = enfermedad;
    }

    public ArrayList<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(ArrayList<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    public Galpon getGalpon() {
        return galpon;
    }

    public void setGalpon(Galpon galpon) {
        this.galpon = galpon;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
    
}
