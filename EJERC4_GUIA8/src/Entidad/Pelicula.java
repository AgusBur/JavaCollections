/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
 */
package Entidad;

public class Pelicula {

    private String title;
    private String director;
    private int hours;

    public Pelicula() {
    }

    public Pelicula(String title, String director, int hours) {
        this.title = title;
        this.director = director;
        this.hours = hours;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Pelicula " + "Título: " + title + ", Director: " + director + ", Duración=" + hours + " hora/s";
    }

}
