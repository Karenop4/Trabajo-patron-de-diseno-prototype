/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author karen
 */
public class Mago extends Personaje{
    private String tipoEncanto;

    public Mago(String tipoEncanto, String imagenRepresentativa, String nombre, String habilidades, String equipo) {
        super(imagenRepresentativa, nombre, habilidades, equipo);
        this.tipoEncanto = tipoEncanto;
    }
    
    public Mago(){
        
    }

    public String getTipoEncanto() {
        return tipoEncanto;
    }

    public void setTipoEncanto(String tipoEncanto) {
        this.tipoEncanto = tipoEncanto;
    }
    
    @Override
    public Mago clone(){
        Mago magoClonado = new Mago(this.getTipoEncanto(), this.getImagenRepresentativa(), 
                this.getNombre(), this.getHabilidades(), this.getEquipo());
        return magoClonado;
    }

    @Override
    public String toString() {
        return super.toString() + "tipoEncanto=" + tipoEncanto;
    }  
}
