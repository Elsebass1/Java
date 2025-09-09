package aerolinea;
// matricula = String
// CapacidadC = int
// porcentaje consumo x vuelo = float
// nivel de desgaste = int
public class Avion {
    private String matricula;
    private int capacidadC;
    private int porcentajeConsumoXvuelo;
    private int nivelDeDesgaste;
//constructor
    public Avion(String matricula, int capacidadC, float porcentajeConsumoXvuelo, int nivelDeDesgaste) {
        this.SetMatricula = matricula;
        this.SetCapacidadC = capacidadC;
        this.SetPorcentajeConsumoXvuelo = porcentajeConsumoXvuelo;
        this.SetNivelDeDesgaste = nivelDeDesgaste;
    }
//getters
    public String getMatricula() {
        return matricula;
    }

    public int getCapacidadC() {
        return capacidadC;
    }

    public float getPorcentajeConsumoXvuelo() {
        return porcentajeConsumoXvuelo;
    }

    public int getNivelDeDesgaste() {
        return nivelDeDesgaste;
    }
// setters 
    public void setMatricula(String matricula) {
        if (matricula != null && matricula.length() > 6){
            System.out.println("Matricula ");
        }else{
            System.out.println("Matricula invalida");
        }
        this.matricula = matricula;
    }

    public void setCapacidadC(int capacidadC) {
        if(capacidadC > 0 && capacidadC <= 5000){
            this.capacidadC = capacidadC;
        }
    }

    public void setPorcentajeConsumoXvuelo(int porcentajeConsumoXvuelo) {
        if(porcentajeConsumoXvuelo >= 5 && porcentajeConsumoXvuelo <= 30)
        this.porcentajeConsumoXvuelo = porcentajeConsumoXvuelo;
    }

    public void setNivelDeDesgaste(int nivelDeDesgaste) {
        if (nivelDeDesgaste >=0 && nivelDeDesgaste <100){
        this.nivelDeDesgaste = nivelDeDesgaste;
        }
    }
//metodo customer
    public int combustibleXvuelo(){
        return this.capacidadC * (this.porcentajeConsumoXvuelo/100);
        
    }
    
}
    

    
}
