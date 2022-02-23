
package Ej4.Comparator;

import Ejercicio4.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
  public static Comparator<Pelicula> ordenarMayor = new Comparator(){
      @Override
      public int compare( Pelicula t1, Pelicula t2){
         
          return t2.getDuracionPeli().compareTo(t1.getDuracionPeli());
          //return t2.getDuracionPeli().compareTo(t1.getDuracionPeli());
      }
         
      @Override
      public int compare(Object t, Object t1) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }
 };
    
    
}
