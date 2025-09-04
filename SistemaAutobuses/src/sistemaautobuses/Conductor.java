package sistemaautobuses;

public class Conductor {
    private String nombre;
    private String licencia;
    private Autobus autobus;
//constructor
    public Conductor(String nombre, String licencia, Autobus autobus) {
        this.SetNombre(nombre);
        this.SetLicencia(licencia);
        this.SetAutobus(autobus);
    }
//getters
    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    public Autobus getAutobus() {
        return autobus;
    }
//setter
    public void setNombre(String nombre) {
        if (nombre != null && nombre.trim().isEmpty()){
            this.nombre = nombre;
        }

    }

    public void setLicencia(String licencia) {
        if(licencia.equals("clase B") || licencia.equals("clase A1") || licencia.equals("clase A3")){
            this.licencia = licencia;
        }else{
            System.out.println("Licencia invalida debe ser de tipo B, A1 o A3");
        }
        this.licencia = licencia;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }
    
    
}
