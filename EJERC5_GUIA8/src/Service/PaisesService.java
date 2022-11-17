/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Service;

import Entidad.Paises;
import Utilidades.PaisesComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Paises> countryList = new HashSet();

    public void crearPaises() {
        String op;
        do {
            Paises country = new Paises();
            System.out.println("Ingrese nombre de un país:");
            country.setName(leer.next().toLowerCase());
            System.out.println("Agregado exitósamente a la lista!");
            countryList.add(country);
            System.out.println("Desea agregar otro? S/N");
            op = leer.next();
        } while (op.equalsIgnoreCase("S"));
        System.out.println("===========LISTA CARGADA===========");
        mostrarLista();
    }

    private void mostrarLista() {
        for (Paises c : countryList) {
            System.out.println(c);
        }
        System.out.println("================================================");
    }

    //NO SE PUEDEN ORDENAR LOS HASHSET!!!! PASAR A ARRAYLIST!!!! y despues todo normal
    public void mostrarOrdenado() {

        ArrayList<Paises> countryArray = new ArrayList(countryList);
        Collections.sort(countryArray, PaisesComparator.ordenarAlfab);
        for (Paises c : countryArray) {
            System.out.println(c);
        }
        System.out.println("================================================");
    }

    public void eliminarPais() {

        String delete;
        boolean flag = false;
        System.out.println("Ingrese país que desee eliminar:");
        delete = leer.next();
        Iterator<Paises> it = countryList.iterator();

        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(delete)) {
                it.remove();
                flag = true;
                break;
            } else {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("ELIMINANDO..");
            System.out.println("============Ahora la lista queda:===============");
            mostrarOrdenado();      
        } else {
            System.out.println("El país no se encuentra en la lista");
        }
    }
}
