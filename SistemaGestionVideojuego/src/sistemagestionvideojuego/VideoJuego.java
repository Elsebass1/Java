package sistemagestionvideojuego;

public class VideoJuego {
    private String idJuego;
    private String titulo;
    private String nivelDificultad;
    private boolean multijugador;

    //constructor
    public VideoJuego(String idJuego, String titulo, String nivelDificultad) {
        this.setIdJuego(idJuego);
        this.setTitulo(titulo);
        this.setNivelDificultad(nivelDificultad);
        this.setMultijugador(multijugador);
    }

    //getter y setters 
    public String getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(String idJuego) {
        if (idJuego != null ) {
            this.idJuego = idJuego;
        } else {
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public boolean isMultijugador() {
        return multijugador;
    }

    public void setMultijugador(boolean multijugador) {
        this.multijugador = multijugador;
    }
    
//toString
    @Override
    public String toString() {
        return "VideoJuego{" + "idJuego=" + idJuego + ", titulo=" + titulo + ", nivelDificultad=" + nivelDificultad + '}';
    }
      
//metodos
    public void mostrarInfo(){
        System.out.println(this);
    }
    public void esMultijugador(){
    }
}
