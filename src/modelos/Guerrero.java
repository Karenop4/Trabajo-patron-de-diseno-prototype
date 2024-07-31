/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author karen
 */
public class Guerrero extends Personaje implements Clonable{
    private int fuerza;

    public Guerrero(int fuerza, String imagenRepresentativa, String nombre, String habilidades, String equipo) {
        super(imagenRepresentativa, nombre, habilidades, equipo);
        this.fuerza = fuerza;
    }
    
    public Guerrero(){
        
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    @Override
    public Guerrero clone(){
        Guerrero guerreroClonado = new Guerrero();
        guerreroClonado.setEquipo(this.getEquipo());
        guerreroClonado.setFuerza(this.getFuerza());
        guerreroClonado.setHabilidades(this.getHabilidades());
        guerreroClonado.setImagenRepresentativa(this.getImagenRepresentativa());
        guerreroClonado.setNombre(this.getNombre());
        return guerreroClonado;
    }

    @Override
    public String toString() {
        return super.toString() + "fuerza=" + fuerza;
    }
    
    
}
