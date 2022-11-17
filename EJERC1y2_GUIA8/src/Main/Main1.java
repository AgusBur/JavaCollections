/*
 1)Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
2)Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Punto 1:
        List <String> nombresRazas = new ArrayList ();
        String op,razaEliminar;
        
        do {            
            System.out.println("Ingrese una raza para agregar a la lista:");
            nombresRazas.add(leer.next());
            System.out.println("Desea agregar otra a la lista? S/N");
            op = leer.next();   
        } while (op.equalsIgnoreCase("s"));
        
        for (String nombresRaza : nombresRazas) {
            System.out.println(nombresRaza);
        }
        
        //Punto 2:
        System.out.println("Ingrese una raza para eliminar de la lista:");
        razaEliminar = leer.next();
        Iterator <String> it = nombresRazas.iterator();
        
        //Recorrer y eliminar con ITERATOR
        while (it.hasNext()) {            
            if (it.next().equalsIgnoreCase(razaEliminar)) {
                it.remove();
            }
        }
        //Ordenar lista con SORT
        Collections.sort(nombresRazas);
        
        //Mostrar lista con raza eliminada y ordenada de forma ASCENDENTE
        for (String nombresRaza : nombresRazas) {
            System.out.println(nombresRaza);
        }      
    }
    
}
