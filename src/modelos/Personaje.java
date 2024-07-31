/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karen
 */
public abstract class Personaje implements Clonable{
    private String imagenRepresentativa;
    private String nombre;
    private String habilidades;
    private String equipo;

    public Personaje(String imagenRepresentativa, String nombre, String habilidades, String equipo) {
        this.imagenRepresentativa = imagenRepresentativa;
        this.nombre = nombre;
        this.habilidades = habilidades;
        this.equipo = equipo;
    }
    
    public Personaje(){
        
    }
    
    public String getImagenRepresentativa() {
        return imagenRepresentativa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setImagenRepresentativa(String imagenRepresentativa) {
        this.imagenRepresentativa = imagenRepresentativa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
    
    @Override
    public Personaje clone() {
        try {
            return (Personaje) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Personaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String toString() {
        return "imagenRepresentativa=" + imagenRepresentativa + ", nombre=" + nombre + ", habilidades=" + habilidades + ", equipo=" + equipo + '}';
    }
    
    
    
}
