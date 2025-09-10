package aerolinea;

public class Piloto {
    private String nombre;
    private String licencia;
    private Avion avion;

    public Piloto(String nombre, String licencia, Avion avion) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.avion = avion;
    }



    public void setNombre(String nombre) {
        if (nombre != null && nombre.isEmpty()){      
            this.nombre = nombre;
        }
    }

    public void setLicencia(String licencia) {
        if (licencia.equals("CPL") || licencia.equals("ATPL")|| licencia.equals("PPL")){
            this.licencia = licencia;
        }else{
            System.out.println("Licencia invaldia debe ser de tipo CPL, ATPL o PPL");
        }
        this.licencia = licencia;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

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
