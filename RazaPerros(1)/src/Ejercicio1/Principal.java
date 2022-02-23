
package Ejercicio1;

import java.util.ArrayList;
import static java.util.Locale.US;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
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
    }
    }
  
