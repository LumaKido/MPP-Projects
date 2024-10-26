package decorator;

public class Cafe implements Bebida {
	public String obterDescricao() {
		return "Cafe";
	}
	
	public double obterCusto() {
		return 5.0;
	}
}
