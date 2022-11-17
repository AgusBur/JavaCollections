/*
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
 */
package Utilidades;

import Entidad.Paises;
import java.util.Comparator;

public class PaisesComparator {
    
    public static Comparator <Paises> ordenarAlfab = new Comparator<Paises>() {
        @Override
        public int compare(Paises t, Paises t1) {
            return t.getName().compareTo(t1.getName());
        }  
    };
}
