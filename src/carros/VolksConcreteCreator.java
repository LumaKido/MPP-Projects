package carros;
//Esta classe é uma subclasse de CarCreator responsável por criar objetos ConcreteProductGol,
//que representam carros da marca Volkswagen.

public class VolksConcreteCreator extends CarCreator {
	protected Car factoryMethod() {
		return new ConcreteProductGol();
	}

}
