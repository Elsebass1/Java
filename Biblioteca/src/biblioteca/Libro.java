package biblioteca;

import java.time.LocalDate;
import java.time.Year;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int numPag;
    private String estado;
    //constructor

    public Libro(String titulo, String autor, int anioPublicacion, int numPag,String estado) {
        this.setTitulo (titulo);
        this.setAutor (autor);
        this.setAnioPublicacion (anioPublicacion);
        this.setNumPag (numPag);
        this.setEstado(estado);
    }
    //getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public int getNumPag() {
        return numPag;
    }

    public String getEstado() {
        return estado;
    }
    //setters con reglas
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        int anioActual = Year.now().getValue();
        if (anioPublicacion <= 1900 || anioPublicacion > anioActual) {
            throw new IllegalArgumentException("El año de publicación debe ser mayor a 1900 y menor o igual al año actual.");
        }
        this.anioPublicacion = anioPublicacion;
    }

    public void setNumPag(int numPag) {
        if (numPag <= 0){
            throw new IllegalArgumentException("El numero de paginas debe ser positivo.");
        }
        this.numPag = numPag;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    //metodos a implementar
    //para calcular los años desde la publicacion del libro
    public int calcularAniosDesdePublicacion() {
        return LocalDate.now().getYear() - this.anioPublicacion;
    }
    //para verificar si el libro puede ser usado
    public boolean puedeSerUsado(int cantidadLecturas) {
        return this.estado.equalsIgnoreCase("Disponible");
    }

}
