package bicicletas;

//Classe bike que impmentar o IFactory para a sua criacao

public class Bike implements IFactory {
	
    public void Corrida(int contagem) {
    	System.out.println("Corrida com a Bike = " + contagem + " km");
    }
}
