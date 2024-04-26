package carros;
/* Esta é a classe que representa o pedido do cliente para a criação do objeto.
 * Ela permite que o cliente receba o produto e suas ações sem saber detalhes da construção do objeto.*/

public class Client {
	public static void main(String [] args) {
		CarCreator creator1 = new FiatConcreteCreator();
		creator1.buildCar();
		CarCreator creator2 = new VolksConcreteCreator();
		creator2.buildCar();
	}
}
