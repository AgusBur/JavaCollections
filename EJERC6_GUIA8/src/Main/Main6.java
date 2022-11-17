/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Main;

import Service.TiendaService;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaService ss = new TiendaService();
        int op;

        System.out.println("===================BIENVENIDO!!===================");
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1: Crear lista de productos");
            System.out.println("2: Mostrar lista completa de productor y precios");
            System.out.println("3: Modificar un precio");
            System.out.println("4: Eliminar un producto");
            System.out.println("5: Salir");
            System.out.print("Ingrese opción:");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    ss.crearProcutos();
                    break;
                case 2:
                    ss.mostrarLista();
                    break;
                case 3:
                    ss.modificarPrecio();
                    break;
                case 4:
                    ss.eliminarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese correctamente");
                    break;
            }
        } while (op != 5);
    }
}
