/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Main;

import Service.AlumnoService;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoService stu = new AlumnoService();
        int op;
        
        System.out.println("======BIENVENIDO======");
        do {     
            System.out.println("Que desea hacer?");
            System.out.println("1: Ingresar alumnos a la lista");
            System.out.println("2: Mostrar lista de alumnos");
            System.out.println("3: Mostrar promedio de algún alumno");
            System.out.println("4: Salir");
            System.out.print("Ingrese opción:");
            op = leer.nextInt();
            System.out.println("=======================");
            
            switch (op) {
                case 1: 
                    stu.crearAlumnos();
                    break;
                case 2:
                    stu.mostrarAlumnos();
                    break;
                case 3:
                    stu.pedirNombre();
                    break;
                case 4: 
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese correctamente");
                    break;        
            }   
        } while (op!=4);
    }  
}
