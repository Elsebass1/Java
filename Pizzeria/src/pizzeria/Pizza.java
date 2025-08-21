package pizzeria;

/**
 *
 * @author CETECOM
 */
public class Pizza {
    private String nombre;
    private String tamanio;
    private String masa;
    
    // metodo constructor

    public Pizza(String nombre, String tamanio, String masa) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.masa = masa;
    }
        //metodos accesadores
    public String getNombre(){
        return this.nombre;
    }
    public String getTamanio(){
        return this.tamanio;
    }
    public String getMasa(){
        return this.masa;
    }
    //metodo mutadores
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public void setTamanio(String nuevoTamanio){
        this.tamanio = nuevoTamanio;
    }
    public void setMasa(String nuevaMasa){
        this.masa = nuevaMasa;
    }


}
