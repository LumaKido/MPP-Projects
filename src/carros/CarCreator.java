package carros;
/* Esta classe é a classe de fábrica. Ela é responsável por criar o objeto a partir da chamada de cliente.
 * Esta classe permite que não seja necessario a criação de um novo objeto a partir da chamadas diretas*/

public abstract class CarCreator {
	public void buildCar() {
		Car carro = factoryMethod();
	}
	protected abstract Car factoryMethod();
}
