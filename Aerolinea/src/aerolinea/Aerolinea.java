package aerolinea;

public class Aerolinea {

    public static void main(String[] args) {
        //crear avion y piloto
        Avion avion1 = new Avion("CC1234",3000,25,15);
        Piloto piloto1 = new Piloto("Maria Torres","ATPL",avion1);
        //impresion de avion y piloto con los getters 
        System.out.println("los datos del piloto serian");
        System.out.println("nombre: "+piloto1.getNombre()+" con licencia: "+piloto1.getLicencia());
        System.out.println("Los datos del avion que pilota");
        System.out.println("Matricula: "+ avion1.getMatriculaAv());
        System.out.println("La capacidad de combustible es de: "+avion1.getCapacidadCombAv()+" litros");
        System.out.println("El porcentaje de consumo por vuelo es de: "+avion1.getPorcentajeConsXvuelo()+"%");
        System.out.println("el nivel de desgaste por vuelo es de: "+avion1.getNivDeDesgaste()+"%");
    }

}
