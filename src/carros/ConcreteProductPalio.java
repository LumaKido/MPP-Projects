package carros;
//Aqui esta sendo setado os atributos de um carro do modelo
//palio de acordo com o padrao de criacao que existe para os carros

public class ConcreteProductPalio extends Car{
	public ConcreteProductPalio() {
		this.setModel("Palio");
		this.setFactory("Fiat");
		this.setCategory("Hatch");
		this.showInformation();
	}
}
