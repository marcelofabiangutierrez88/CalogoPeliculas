
package com.marcelo.peliculas.domain;

/**
 *
 * @author Marcelo
 */
public class Pelicula {
    private String nombre;

public Pelicula(String nombre){
    this.nombre = nombre;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + '}';
    }    
}
