/*
 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Service;

import Entidad.Pelicula;
import Utilidades.PeliculaComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> movieList = new ArrayList();

    public void crearPeliculas() {
        String op;
        double minute;
        System.out.println("=========================================================");
        do {
            Pelicula movie = new Pelicula();
            System.out.println("Ingrese nombre de una película:");
            movie.setTitle(leer.next());
            System.out.println("Ingrese el director:");
            movie.setDirector(leer.next());
            System.out.println("Ingrese la duración en minutos:");
            minute = leer.nextDouble();
            movie.setHours(pasarHoras(minute));
            System.out.println("=======Película añanadida a lista!=======");
            movieList.add(movie);
            System.out.println("Desea agregar otra película a la lista? S/N");
            op = leer.next();
        } while (op.equalsIgnoreCase("S"));
    }

    private int pasarHoras(double minute) {
        int hours;
        if (minute>60 && minute<120) {
            hours=1;
        } else {
            hours=(int)minute/60;
        }
        return hours;
    }

    public void mostrarListaCompleta() {

        Iterator it = movieList.iterator();
        System.out.println("=========================================================");
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }

    public void mostrarPelisMas1Hora() {

        System.out.println("=========================================================");
        for (Pelicula m : movieList) {
            if (m.getHours() >= 1) {
                System.out.println(m);
            }
        }
    }

    public void ordenarDescendHoras() {
        System.out.println("=========================================================");
        Collections.sort(movieList, PeliculaComparator.ordenarTiempo.reversed());
        System.out.println("======Orden de mayor a menor duración======");
        for (Pelicula m : movieList) {
            System.out.println(m);
        }
    }

    public void ordenarAscendHoras() {
        System.out.println("=========================================================");
        Collections.sort(movieList, PeliculaComparator.ordenarTiempo);
        System.out.println("======Orden de mayor a menor duración======");
        for (Pelicula m : movieList) {
            System.out.println(m);
        }
    }

    public void ordenarAlfabTitulo() {
        System.out.println("=========================================================");
        Collections.sort(movieList, PeliculaComparator.ordenarAlfabTitu);
        for (Pelicula m : movieList) {
            System.out.println(m);
        }
    }

    public void ordenarAlfabDire() {
        System.out.println("=========================================================");
        Collections.sort(movieList, PeliculaComparator.ordenarAlfabDire);
        for (Pelicula m : movieList) {
            System.out.println(m);
        }
    }
}
