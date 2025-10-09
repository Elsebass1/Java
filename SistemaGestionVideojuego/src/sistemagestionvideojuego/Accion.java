package sistemagestionvideojuego;
import java.util.ArrayList;

public class Accion extends VideoJuego{
    private ArrayList<String> armasDisponibles; 
    private int misiones;
    
//constructor
    public Accion(ArrayList<String> armasDisponibles, int misiones, String idJuego, String titulo, String nivelDificultad) {
        super(idJuego, titulo, nivelDificultad);
        this.armasDisponibles = new ArrayList<>();
        this.misiones = misiones;
    }
    
    //getters y setters 
    public ArrayList<String> getArmasDisponibles() {
        return armasDisponibles;
    }

    public void setArmasDisponibles(ArrayList<String> armasDisponibles) {
        this.armasDisponibles = armasDisponibles;
    }

    public int getMisiones() {
        return misiones;
    }

    public void setMisiones(int misiones) {
        this.misiones = misiones;
    }
    
    //metodos 
    public void agregarArma(String arma){
            armasDisponibles.add(arma);
    }
    public void mostrarArmas(){
    }
    
}
