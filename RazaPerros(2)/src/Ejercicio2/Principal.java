package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Locale.US;
import java.util.Scanner;

/**
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario
 * se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el
 * perro en la lista. Si el perro está en la lista, se eliminará el perro que
 * ingresó el usuario y se mostrará la lista ordenada. Si el perro no se
 * encuentra en la lista, se le informará al usuario y se mostrará la lista
 * ordenada.
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<String> razaPerros = new ArrayList();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
        char salir;

        do {
            System.out.println("Ingrese una raza de perro: ");
            String razas = leer.next();
            razaPerros.add(razas);

            System.out.println("¿Desea agragar mas razas de perro?");
            System.out.println("Ingrese S, para SI y N,para NO");
            salir = leer.next().charAt(0); //para leer un caracter, el primero de la letra
        } while (salir == 'S' || salir == 's');

        System.out.println("Las razas ingresadas son: ");
        for (String tiporazas : razaPerros) {
            System.out.println(tiporazas);
        }

        System.out.println("Ingrese el perro que desea buscar");
        String buscarPerro = leer.next();

        Iterator iterator = razaPerros.iterator();
        boolean bandera = false;
        while (iterator.hasNext()) { // hasNext siempre pregunta si hay un siguiente posicion por recorrer
            //  System.out.println(iterator.next()); // este tiene el valor de cada posicion del arrayList
            if (iterator.next().equals(buscarPerro)) {
                iterator.remove();
                bandera = true;
            }
        }
        
        if (bandera = true) {
            System.out.println("El perro ingresado se elimino correctamente");

        } else {
            System.out.println("El perro ingresado no se encontro");
        }
        System.out.println("*****************************************");
         System.out.println("Las lista final de perros es: ");
        for (String tiporazas : razaPerros) {
            System.out.println(tiporazas);
        }
    }
}
