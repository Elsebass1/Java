package sistemagestionvideojuego;
import java.util.ArrayList;

public class Jugador {
    private String idJugador;
    private String nombre;
    private ArrayList<Partida> partidas;
    
//constructor
    public Jugador(String idJugador, String nombre, ArrayList<Partida> partidas) {
        this.setIdJugador (idJugador);
        this.setNombre(nombre);
        this.setPartidas(partidas);
    }
    
//getters y setters 
    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

//metodos
    public void calcularPromedioPuntaje(){
    }
}
