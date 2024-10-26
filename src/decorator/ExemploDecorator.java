package decorator;

public class ExemploDecorator {
	public static void main(String args []) {
		Bebida cafe = new Cafe();
		Bebida choco = new Chocolate();
		
		//Adicionando leite e acucar
		cafe = new LeiteDecorator(cafe);
		cafe = new AcucarDecorator(cafe);
		
		System.out.println("Bebida: " + cafe.obterDescricao());
		System.out.println("Custo: " + cafe.obterCusto() + "\n");
		
		cafe = new ChocolateDecorator(cafe);
		cafe = new ChantillyDecorator(cafe);
		
		System.out.println("Bebida: " + cafe.obterDescricao());
		System.out.println("Custo: " + cafe.obterCusto() + "\n");
		
		choco = new LeiteDecorator(choco);
		choco = new AcucarDecorator(choco);
		choco = new ChantillyDecorator(choco);
		
		System.out.println("Bebida: " + choco.obterDescricao());
		System.out.println("Custo: " + choco.obterCusto() + "\n");
	}
}
