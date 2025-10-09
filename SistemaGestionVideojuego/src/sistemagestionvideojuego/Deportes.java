package sistemagestionvideojuego;
import java.util.ArrayList;

public class Deportes extends VideoJuego{
    private String tipoDeporte;
    private ArrayList<String> equiposDisponibles;
    
//constructor
    public Deportes(String tipoDeporte, ArrayList<String> equiposDisponibles, String idJuego, String titulo, String nivelDificultad) {
        super(idJuego, titulo, nivelDificultad);
        this.setEquiposDisponibles(equiposDisponibles);
        this.setTipoDeporte(tipoDeporte);
    }
    
//getters y setters 
    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public ArrayList<String> getEquiposDisponibles() {
        return equiposDisponibles;
    }

    public void setEquiposDisponibles(ArrayList<String> equiposDisponibles) {
        this.equiposDisponibles = equiposDisponibles;
    }

//metodos
    public void mostrarEquipo(){
    }
}
