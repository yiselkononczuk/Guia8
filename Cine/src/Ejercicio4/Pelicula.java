/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Ejercicio4;

import java.util.Comparator;
import static java.util.Locale.US;
import java.util.Scanner;

public class Pelicula {
    private String titulo;
    private String director; 
    private double duracionPeli;

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
    
public Pelicula(){
    
}

    public Pelicula(String titulo, String director, double duracionPeli) {
        this.titulo = titulo;
        this.director = director;
        this.duracionPeli = duracionPeli;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracionPeli() {
        return this.duracionPeli;
    }

    public void setDuracionPeli(double duracionPeli) {
        this.duracionPeli = duracionPeli;
    }

    
    
    public void crearPelicula(){
        System.out.println("Ingrese el nombre de la Película: ");
        this.setTitulo(leer.nextLine());
        System.out.println("Nombre del director:");
        this.setDirector(leer.nextLine());
        System.out.println("Duración de la película en horas (Ej: 2.15 )");
        this.setDuracionPeli(leer.nextDouble());
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + titulo + ", Director=" + director + ",Duracion de la Película=" + duracionPeli  + "hs." + '}';
    }
    
    public boolean peliSuperior1hs (){
        if (this.duracionPeli > 1.00 || this.duracionPeli > 100 ){
            return true;
        }
        return false; 
    }
    
  
    
 

}
