/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Main;

import Service.PeliculaService;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaService serv = new PeliculaService();
        int op;

        System.out.println("====================BIENVENIDO====================");

        do {
            System.out.println("Que desea hacer?");
            System.out.println("1:Crear lista de películas");
            System.out.println("2:Mostrar lista de películas");
            System.out.println("3:Mostrar pelis >1hora");
            System.out.println("4:Mostrar peli ordenada de mayor a menor duración");
            System.out.println("5:Mostrar pelis ordenada de menor a mayor duración");
            System.out.println("6:Mostrar lista ordenada alfabéticamente por título");
            System.out.println("7:Mostrar lista ordenada alfabéticamente por director");
            System.out.println("8:SALIR");
            System.out.print("Ingrese opción:");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    serv.crearPeliculas();
                    break;
                case 2:
                    serv.mostrarListaCompleta();
                    break;
                case 3:
                    serv.mostrarPelisMas1Hora();
                    break;
                case 4:
                    serv.ordenarDescendHoras();
                    break;
                case 5:
                    serv.ordenarAscendHoras();
                    break;
                case 6:
                    serv.ordenarAlfabTitulo();
                    break;
                case 7:
                    serv.ordenarAlfabDire();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese correctamente");
            }
        } while (op != 8);
    }
}
