package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
       
        ArrayList<Alumno> listadoAlumnos = new ArrayList();
         
        char opcion;
        do {
            Alumno alumno = new Alumno();
            alumno.solicitarDatos();
            listadoAlumnos.add(alumno);// con esto cargo los distintos alumnos que voy creando.
            System.out.println("Desea crear otro alumno? Si/No ");
            opcion = leer.next().charAt(0);
        } while (opcion== 's' || opcion == 'S');

        for (Alumno auxAlumnos : listadoAlumnos){
            System.out.println( auxAlumnos.toString());
            System.out.println(" " + auxAlumnos.notaFinal());
        }
        
        }
}


