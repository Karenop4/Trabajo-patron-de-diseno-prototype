/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author karen
 */
public class PersonajesCache {
    private static Map<String, Personaje> mapPersonajes = new HashMap<>();
    
    public static void regristrar(){
        Guerrero nuevoGuerrero = new Guerrero(200, "src\\resources\\imagenes\\Imagen guerrero 1.jpeg", "Alexios", "Sigilo", "La Hueste del Dragón");
        Mago nuevoMago = new Mago("Protección", "src\\resources\\imagenes\\Imagen mago 1.jpeg", "Elminster", "Escudos protectores:", "La Orden del Fénix");
        
        mapPersonajes.put(nuevoGuerrero.getNombre(), nuevoGuerrero);
        mapPersonajes.put(nuevoMago.getNombre(), nuevoMago);
    }
    
    public static Personaje clonar(String nombrePersonaje){
        Personaje mapPersonaje = mapPersonajes.get(nombrePersonaje);
        return mapPersonaje.clone();
    }
    
    public static Map<String, Personaje> retornarMapaPerdonajes(){
        return mapPersonajes;
    }
}
