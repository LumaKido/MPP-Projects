package bicicletas;

//Classe scooter que impmentar o IFactory para a sua criacao

public class Scooter implements IFactory {
	
    public void Corrida(int contagem) {
    	System.out.println("Corrida com a Scooter = " + contagem + " km");
    }
}
