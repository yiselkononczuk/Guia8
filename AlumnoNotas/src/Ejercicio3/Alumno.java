
package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Locale.US;
import java.util.Scanner;

/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
*/
public class Alumno {
    
   private String nombre; 
   private ArrayList<Integer> listaNotas = new ArrayList();
   
   public Alumno(){  
}

    public Alumno(String nombre, ArrayList<Integer> listaNotas) {
        this.nombre = nombre;
        this.listaNotas= listaNotas;
    }
   

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return this.listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }
    //metodo para rellenar el ArrayList de notas 
    public void setNota(int nota){
        this.listaNotas.add(nota);
    }
    
    public void solicitarDatos(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
        System.out.println("Ingrese el nombre del alumno.");
        this.setNombre(leer.nextLine());
        for (int i = 1; i < 4; i++) {
        System.out.println("Ingrese la nota " + i );
        this.setNota(leer.nextInt());
        }
        
    }
    

    
    public double notaFinal(){
        double promedio= 0;
           for (Integer sumaNotas : listaNotas){
               promedio= promedio + sumaNotas ;   
        }
        double califFinal= promedio / 3; 
        return califFinal;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", calif Final=" + notaFinal() +'}';
    }
    
    
            
}
