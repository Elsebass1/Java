package sistemagestionvideojuego;

public class Partida {
    private VideoJuego juego;
    private String fechaInicio;
    private int puntajeObtenido;
    
//constructor
    public Partida(VideoJuego juego, String fechaInicio, int puntajeObtenido) {
        this.setJuego(juego);
        this.setFechaInicio(fechaInicio);
        this.setPuntajeObtenido (puntajeObtenido);
    }
    
//getters y setters 
    public VideoJuego getJuego() {
        return juego;
    }

    public void setJuego(VideoJuego juego) {
        this.juego = juego;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getPuntajeObtenido() {
        return puntajeObtenido;
    }

    public void setPuntajeObtenido(int puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }
    
//metodos
    public void evaluarRendimiento(){
    }
}
