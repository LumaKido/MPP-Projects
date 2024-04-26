package carros;
//Aqui esta sendo setado os atributos de um carro do modelo
//gol de acordo com o padrao de criacao que existe para os carros

public class ConcreteProductGol extends Car{
	 
	public ConcreteProductGol() {
		this.setModel("Gol");
		this.setFactory("Volka");
		this.setCategory("Hatch");
		this.showInformation();
	}
}
