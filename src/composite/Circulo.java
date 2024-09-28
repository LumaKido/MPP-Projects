package composite;

public class Circulo implements Figura {
	public void desenha() {
		System.out.println("Circulo desenhado");
	}

	@Override
	public void mudaCordeFundo(Cor cor) {
		System.out.println("Cor do circulo mudado para "+ cor);
	}
}
