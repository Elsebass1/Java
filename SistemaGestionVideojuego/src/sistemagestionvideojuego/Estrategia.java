package sistemagestionvideojuego;

public class Estrategia extends VideoJuego{
    private int niveles;
    private boolean requierePensamientoRapido;
    private double calcularDuracionEstimada;
//constructor
    public Estrategia(int niveles, boolean requierePensamientoRapido, String idJuego, String titulo, String nivelDificultad) {
        super(idJuego, titulo, nivelDificultad);
        this.setRequierePensamientoRapido(requierePensamientoRapido);
        this.setNiveles(niveles);
        this.setCalcularDuracionEstimada(calcularDuracionEstimada);
    }
    
//getter y setters 
    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

    public boolean isRequierePensamientoRapido() {
        return requierePensamientoRapido;
    }

    public void setRequierePensamientoRapido(boolean requierePensamientoRapido) {
        this.requierePensamientoRapido = requierePensamientoRapido;
    }

    public double getCalcularDuracionEstimada() {
        return calcularDuracionEstimada;
    }

    public void setCalcularDuracionEstimada(double alcularDuracionEstimada) {
        this.calcularDuracionEstimada = alcularDuracionEstimada;
    }
    
    
//Metodos
    public void calcularDuracionEstimada(){
    }
}
