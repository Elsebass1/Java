package aerolinea;

public class Piloto {
    private String nombre;
    private String licencia;
    private Avion avion;
// constructor
    public Piloto(String nombre, String licencia, Avion avion) {
        this.SetNombre (nombre);
        this.SetLicencia (licencia);
        this.SetAvion (avion);
    }
    // setters
    public void setNombre(String nombre) {
    if (nombre != null && nombre.trim().isEmpty()){
        this.nombre = nombre;
        }
    }

    public void setLicencia(String licencia) {
        if(licencia.equals("clase CPL") || licencia.equals("clase ATPL") || licencia.equals("clase PPL")){
            this.licencia = licencia;
        }else{
            System.out.println("Licencia invalida debe ser de tipo CPL, ATPL o PPL");
        }
        this.licencia = licencia;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
//getters
    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public Avion getAvion() {
        return avion;
    }

    
}
