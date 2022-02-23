
package Ejercicio4;

import java.util.ArrayList;
import static java.util.Locale.US;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
       
        ArrayList<Pelicula> listadoPeliculas= new ArrayList();
        
        char opcion;
        do {
            Pelicula pelicula = new Pelicula();
            pelicula.crearPelicula();
            listadoPeliculas.add(pelicula);
            System.out.println("Desea agregar otra Película? Si/No ");
            opcion = leer.next().charAt(0);
        } while (opcion== 's' || opcion == 'S');
        
        for (Pelicula auxPelicula : listadoPeliculas){
            System.out.println( auxPelicula.toString());
    }
        System.out.println("***LISTADO DE PELÍCULAS SUPERIOR A 1 HORA***");
        for (Pelicula auxPelicula : listadoPeliculas){
            if (auxPelicula.peliSuperior1hs()== true ){
                System.out.println( auxPelicula.toString());
            }
            
        }
    }
}
