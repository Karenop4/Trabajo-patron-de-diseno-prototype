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
public class RegistroPersonajesClonados {
    private static Map<String, Personaje> mapPersonajesClonados = new HashMap<>();
    
    
    public static void agregar(Personaje personaje){
        mapPersonajesClonados.put(personaje.getNombre(), personaje);
    }
    
    public static void modificar(Personaje anteriorPersonaje, Personaje nuevoPersonaje){
        for (Map.Entry<String, Personaje> entrada : mapPersonajesClonados.entrySet()){
            String key = entrada.getKey();
            if(key == anteriorPersonaje.getNombre()){
                mapPersonajesClonados.remove(key);
                mapPersonajesClonados.put(nuevoPersonaje.getNombre(), nuevoPersonaje);
                break;
            }
        }
        
    }
    
    public static void eliminar(Personaje eliminarPersonaje){
        for (Map.Entry<String, Personaje> entrada : mapPersonajesClonados.entrySet()){
            String key = entrada.getKey();
            if(key == eliminarPersonaje.getNombre()){
                mapPersonajesClonados.remove(key);
                break;
            }
        }
    }
    
    public static Personaje getPersonajeClonado(String nombrePersonaje){
        return mapPersonajesClonados.get(nombrePersonaje);
    }
    
    public static Map<String, Personaje> retornarMapaPerosnajesClonados(){
        return mapPersonajesClonados;
    }
}
