//
package aerolinea;

public class Avion {
    private String matriculaAv;
    private int capacidadCombAv;
    private int porcentajeConsXvuelo;
    private int nivDeDesgaste;
    //constructor

    public Avion(String matriculaAv, int capacidadCombAv, int porcentajeConsXvuelo, int nivDeDesgaste) {
        this.matriculaAv = matriculaAv;
        this.capacidadCombAv = capacidadCombAv;
        this.porcentajeConsXvuelo = porcentajeConsXvuelo;
        this.nivDeDesgaste = nivDeDesgaste;
    }

    public void setMatriculaAv(String matriculaAv) {
        if (matriculaAv != null && matriculaAv.length()>= 6){
            this.matriculaAv = matriculaAv;
        }else{
            this.matriculaAv = "invalida";
        }
    }

    public void setCapacidadCombAv(int capacidadCombAv) {
        if (capacidadCombAv > 0 && capacidadCombAv >= 5000);
            this.capacidadCombAv = capacidadCombAv;
    }

    public void setPorcentajeConsXvuelo(int porcentajeConsXvuelo) {
        if(porcentajeConsXvuelo >=10 && porcentajeConsXvuelo <= 35);
            this.porcentajeConsXvuelo = porcentajeConsXvuelo;
    }

    public void setNivDeDesgaste(int nivDeDesgaste) {
        if(nivDeDesgaste >=0 && nivDeDesgaste <= 100);
            this.nivDeDesgaste = nivDeDesgaste;
    }

    public String getMatriculaAv() {
        return matriculaAv;
    }

    public int getCapacidadCombAv() {
        return capacidadCombAv;
    }

    public int getPorcentajeConsXvuelo() {
        return porcentajeConsXvuelo;
    }

    public int getNivDeDesgaste() {
        return nivDeDesgaste;
    }
    //customer
    public int calculoConsXvuelo(){
        return porcentajeConsXvuelo = capacidadCombAv * (porcentajeConsXvuelo / 100);
    }
    
}
