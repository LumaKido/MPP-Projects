package composite;

public class Triangulo implements Figura {
	public void desenha() {
		System.out.println("Triangulo desenhado");
	}

	@Override
	public void mudaCordeFundo(Cor cor) {
		System.out.println("Cor do triangulo mudado para "+ cor);
	}
}
