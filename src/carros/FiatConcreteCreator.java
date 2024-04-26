package carros;
//Implementa uma classe concreta que cria os carros da marca Fiat, 
//de acordo com o FactoryMethod

public class FiatConcreteCreator extends CarCreator {

	protected Car factoryMethod() {
		return new ConcreteProductPalio();
	}
}
