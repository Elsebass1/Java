package pizzeria;
/**
 *
 * @author CETECOM
 */
public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la pizzeria");
        //crear un objeto
        Pizza P1 = new Pizza("napolitana","mediana","a la piedra");
        Pizza P2 = new Pizza("cuatro quesos","familiar","tradicional");
        
        
        System.out.println("La pizza 2 es una pizza: "+ P2.getNombre());
        System.out.println("El tamanio de la pizza 2 es: "+ P2.getTamanio());
        System.out.println("La masa de la pizza 2 es: "+ P2.getMasa());
        
        P2.setNombre("vegetariana");
        System.out.println("La pizza 2 es una pizza: "+ P2.getNombre());
        P2.setTamanio("personal");
        System.out.println("El tamanio de la pizza 2 es: "+ P2.getTamanio());
        P2.setMasa("delgada");
        System.out.println("La masa de la pizza 2 es: "+ P2.getMasa());
        
        System.out.println("/////////\\\\\\\\");
        
        System.out.println("La pizza 1 es una pizza: "+ P1.getNombre());
        System.out.println("El tamanio de la pizza 1 es: "+ P1.getTamanio());
        System.out.println("La masa de la pizza 1 es: "+ P1.getMasa());
        
        P1.setNombre("vegetariana");
        System.out.println("La pizza 1 es una pizza: "+ P1.getNombre());
        P1.setTamanio("personal");
        System.out.println("El tamanio de la pizza 1 es: "+ P1.getTamanio());
        P1.setMasa("delgada");
        System.out.println("La masa de la pizza 1 es: "+ P1.getMasa());
    }

}
