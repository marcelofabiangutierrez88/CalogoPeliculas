
package EjercicioLaboratorioFinal;

import com.marcelo.peliculas.negocio.CatalogoPeliculas;
import com.marcelo.peliculas.negocio.CatalogoPeliculasImpl;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class MarceloLaboratorioFinal {
    private static final Scanner scanner = new Scanner (System.in) ;
    private static int opcion = -1;
    private static final String nombreArchivo ="C:\\Users\\Marcelo\\Desktop\\Programacion\\Java\\CatalogoPeliculas\\peliculas.txt";
    private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();
    
    
   
    public static void main(String[] args) {
        while (opcion != 0){
            try {
                System.out.println("Elegi opcion:\n1.-Iniciar Catalogo Peliculas"
                +"\n2.-Agregar Peliculas\n"
                +"3.-Listar Peliculas\n"
                +"4.-Buscar Peliculas"
                +"0.-Salir");
                
                opcion = Integer.parseInt(Scanner.nextLine());
                switch (opcion){
                    case 1 :
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2 : 
                        System.out.println("Introduce el nombre de una pelicula a agregar: ");
                        String nombre = scanner.nextLine();
                        catalogoPeli.listarPelicula(nombreArchivo);
                        break;
                    case 3 :
                        catalogoPeli.listarPelicula(nombreArchivo);
                        break;
                    case 0 :
                        System.out.println("Hasta Pronto!!!!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");
            } catch (Exception e)
                System.out.println("Error!!");
        }
        
    }
    
}
