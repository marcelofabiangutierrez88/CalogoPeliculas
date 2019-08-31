
package com.marcelo.peliculas.datos;

import java.util.List;
import com.marcelo.peliculas.domain.*;
import com.marcelo.peliculas.excepciones.*;

/**
 *
 * @author Marcelo
 */
public interface AccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    public List <Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    void escribir (Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    public String buscar(String nombreArchivo, String buscar)throws LecturaDatosEx;
    public void crear(String nombreArchivo) throws AccesoDatosEx;
    public void borrar(String nombreArchivo) throws AccesoDatosEx;
}
