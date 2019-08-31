
package com.marcelo.peliculas.excepciones;

/**
 *
 * @author Marcelo
 */
public class AccesoDatosEx extends Exception{
    String mensaje;
    
    public AccesoDatosEx(String mensaje){
        this.mensaje = mensaje;
    }
    
}
