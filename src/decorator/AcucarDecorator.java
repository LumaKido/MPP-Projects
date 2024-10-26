package decorator;

public class AcucarDecorator extends BebidaDecorator{
	public AcucarDecorator(Bebida bebida) {
		super(bebida);
	}
	
	public String obterDescricao() {
		return super.obterDescricao() + ", Acucar";
	}
	
	public double obterCusto() {
		return super.obterCusto() + 0.5;
	}
}
