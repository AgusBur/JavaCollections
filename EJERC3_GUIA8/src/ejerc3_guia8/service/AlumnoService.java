/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ejerc3_guia8.service;

import ejerc3_guia8.entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> student = new ArrayList();

    //si fuese que creamos un solo alumno puedo poner la linea 28 y 29 afuera,
    //por debajo de Scanner
    //pero como queremos crear varios alumnos las pongo dentro del metodo
    public void crearAlumnos() {
        String op;
        do {
            Alumno stu = new Alumno();
            ArrayList<Integer> notes = new ArrayList();
            System.out.println("Ingrese nombre del alumno:");
            stu.setName(leer.next());
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota: " + (i + 1));
                notes.add(leer.nextInt());
            }
            System.out.println("======Alumno creado======");
            stu.setNotes(notes);
            student.add(stu);
            System.out.println("Dese ingresar otro alumno? S/N");
            op = leer.next();
        } while (op.equalsIgnoreCase("S"));
    }

    //Creo iterator para mostrar contenido de la lista cargada de alumnos
    public void mostrarAlumnos() {
        Iterator it = student.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }

    public void pedirNombre() {

        String name;
        boolean flag = false;
        System.out.println("Ingrese el nombre de un alumno para calcular promedio:");
        name = leer.next();
        for (Alumno a : student) {
            if (a.getName().contains(name)) {
                mostrarPromedio(name);
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            System.out.println("El nombre no está en la lista de alumnos");
        }
    }

    private void mostrarPromedio(String name) {

        int average = 0;
        ArrayList<Integer> sumaNotas = new ArrayList();
        for (Alumno a : student) {
            if (a.getName().contains(name)) {
                sumaNotas = a.getNotes();
                for (Integer s : sumaNotas) {
                    average += s;
                }
            }
        }
        System.out.println("El promedio de las 3 notas es: " + average / 3);
    }
}
