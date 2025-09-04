package sistemaautobuses;

public class Autobus {
    private String patente;
    private int capacidadC;
    private int consumo;
    private int desgaste;

    //constructor
    public Autobus(String patente, int capacidadC, int consumo, int desgaste) {
        this.SetPatente(patente);
        this.SetCapacidadC(capacidadC);
        this.SetConsumo(consumo);
        this.SetDesgaste(desgaste); 
        
    //getter 
    }

    public String getPatente() {
        return patente;
    }

    public int getCapacidadC() {
        return capacidadC;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getDesgaste() {
        return desgaste;
    }
//setter 
    public void setPatente(String patente) {
        if (patente != null && patente.length() > 6){
            System.out.println("Patente ");
        }else{
            System.out.println("Patente invalida");
        }
        this.patente = patente;
    }

    public void setCapacidadC(int capacidadC) {
        if(capacidadC > 0 && capacidadC <= 1200){
            this.capacidadC = capacidadC;
        }
    }

    public void setConsumo(int consumo) {
        if(consumo >= 5 && consumo <= 30)
        this.consumo = consumo;
    }

    public void setDesgaste(int desgaste) {
        if (desgaste >=0 && desgaste <100){
        this.desgaste = desgaste;
        }
    }
    //metodos personalizados o Customer
    public int calcularConsumoPorRecorrido(){
        return this.capacidadC * (this.consumo/100);
        
    }
    public boolean puedeRealizaRecorrido(int cantidad){
        int consumoTotal = calcularConsumoPorRecorrido() * cantidad;
        if(consumoTotal <=this.capacidadC)
            return true;
        return false;
        
    }
}