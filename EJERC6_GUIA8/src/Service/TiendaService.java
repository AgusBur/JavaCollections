/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap).
 */
package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> listMap = new HashMap();

    public void crearProcutos() {
        String op, name;
        int price;
        do {
            System.out.println("Ingrese el nombre del producto a agregar a la lista:");
            name = leer.next();
            System.out.println("Ingrese su precio:");
            price = leer.nextInt();
            System.out.println("EXCELENTE, PRODUCTO CARGADO!!");
            listMap.put(name.toUpperCase(), price);
            System.out.println("Desea agregar otro producto? S/N");
            op = leer.next();
            System.out.println("=====================================================");
        } while (op.equalsIgnoreCase("S"));
    }

    public void mostrarLista() {

        System.out.println("Lista de productos:");
        for (Map.Entry<String, Integer> entry : listMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(entry);
        }
        System.out.println("=====================================================");
    }

    public void modificarPrecio() {
        String op;
        int newPrice;
        boolean flag = false;
        System.out.println("Ingrese el nombre del producto del que desea modificar el precio");
        op = leer.next();

        if (verificarProducto(op)) {
            for (Map.Entry<String, Integer> entry : listMap.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (key.equalsIgnoreCase(op)) {
                    System.out.println("El producto sí está en la lista!");
                    System.out.println("Su precio es: " + value);
                    System.out.println("Ingrese nuevo valor:");
                    newPrice = leer.nextInt();
                    entry.setValue(newPrice);
                    System.out.println("PRECIO CAMBIADO EXITOSAMENTE!");
                    System.out.println("=================LA LISTA QUEDA:====================");
                    mostrarLista();
                    break;
                }
            }
        } else {
            System.out.println("El producto no está en la lista");
        }
    }

    private boolean verificarProducto(String op) {
        boolean flag = false;
        for (Map.Entry<String, Integer> entry : listMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (key.equalsIgnoreCase(op)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void eliminarProducto() {
        String op, op2;
        System.out.println("Ingrese el nombre del producto que desea eliminar:");
        op = leer.next();

        if (verificarProducto(op)) {
            for (Map.Entry<String, Integer> entry : listMap.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (key.equalsIgnoreCase(op)) {
                    listMap.remove(key);
                    System.out.println("PRODUCTO ELIMINADO!!");
                    System.out.println("==============LA LISTA QUEDA:===============");
                    mostrarLista();
                    break;
                }
            }
        } else {
            System.out.println("El producto no está en la lista");
        }
    }
}
