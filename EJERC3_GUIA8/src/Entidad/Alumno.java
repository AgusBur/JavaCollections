/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package Entidad;

import java.util.ArrayList;

public class Alumno {
    
    private String name;
    private ArrayList <Integer> notes;

    public Alumno() {
    }

    public Alumno(String name, ArrayList<Integer> notes) {
        this.name = name;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Integer> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        
        return "Alumno:" + "Nombre: " + name.toUpperCase() + ", Notas:" + notes ;
    }

}
