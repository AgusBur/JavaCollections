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
package Main;

import Service.PaisesService;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        PaisesService cs = new PaisesService();
        int op;

        System.out.println("=================BIENVENIDO=================");
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1: Ingresar países a la lista");
            System.out.println("2: Mostrar lista ordenada alfabéticamente");
            System.out.println("3: Eliminar algún elemento de la lista");
            System.out.println("4: Salir");
            System.out.print("Ingrese opción:");
            op = leer.nextInt();
            System.out.println("================================================");
            switch (op) {
                case 1:
                    cs.crearPaises();
                    break;
                case 2:
                    cs.mostrarOrdenado();
                    break;
                case 3:
                    cs.eliminarPais();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese una correcta");
                    break;
            }
        } while (op != 4);
    }
}
