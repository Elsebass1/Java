package biblioteca;

public class Biblioteca {

public static void main(String[] args) {
        try {
            // Crear un libro con datos de ejemplo
            Libro libroEjemplo = new Libro("Patrones de Disenio: Elementos de Software Reusable Orientado a Objetos", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 1994, 416, "Disponible");

            // Imprimir el título y autor
            System.out.println("Titulo: " + libroEjemplo.getTitulo());
            System.out.println("Autor: " + libroEjemplo.getAutor());
            System.out.println("----------------------------------------");

            // Imprimir los demás atributos
            System.out.println("Anio de Publicacion: " + libroEjemplo.getAnioPublicacion());
            System.out.println("Numero de Paginas: " + libroEjemplo.getNumPag());
            System.out.println("Estado: " + libroEjemplo.getEstado());
            System.out.println("----------------------------------------");

            // Imprimir los años transcurridos desde la publicación
            System.out.println("Anios transcurridos desde la publicacion: " + libroEjemplo.calcularAniosDesdePublicacion());
            System.out.println("----------------------------------------");

            // Verificar si el libro puede ser usado e imprimir el resultado
            int lecturasSolicitadas = 5;
            boolean puedeUsarse = libroEjemplo.puedeSerUsado(lecturasSolicitadas);
            System.out.println("Puede el libro ser usado para " + lecturasSolicitadas + " lecturas? " + (puedeUsarse ? "Si" : "No"));

            // Ejemplo para un libro no disponible
            System.out.println("----------------------------------------");
            Libro libroNoDisponible = new Libro("Algoritmos: La Guía Definitiva", "Thomas H. Cormen", 2009, 1312, "En reparacion");
            System.out.println("Estado del libro: " + libroNoDisponible.getEstado());
            System.out.println("Puede el libro ser usado? " + (libroNoDisponible.puedeSerUsado(3) ? "Sí" : "No"));

        } catch (IllegalArgumentException e) {
            System.err.println("Error al crear el libro: " + e.getMessage());
        }
    }
}