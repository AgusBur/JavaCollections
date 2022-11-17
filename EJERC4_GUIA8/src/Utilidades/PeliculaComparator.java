/*
  • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

public class PeliculaComparator {

    public static Comparator<Pelicula> ordenarTiempo = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula t, Pelicula t1) {
            int answ = 0;
            if (t.getHours() > t1.getHours()) {
                answ = 1;
            } else if (t.getHours() < t1.getHours()) {
                answ = -1;
            } else {
                answ = 0;
            }
            return answ;
        }
    };

    public static Comparator<Pelicula> ordenarAlfabTitu = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitle().compareTo(t1.getTitle());
        }
    };

    public static Comparator<Pelicula> ordenarAlfabDire = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
