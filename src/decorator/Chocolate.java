package decorator;

public class Chocolate implements Bebida{
	public String obterDescricao() {
		return "Chocolate";
	}
	
	public double obterCusto() {
		return 5.0;
	}
}
