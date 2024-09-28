package composite;

import java.util.ArrayList;

public class FiguraAgrupada implements Figura {
	private ArrayList<Figura> figuras = new ArrayList<Figura>();

	public void adicionar(Figura fig) {
		figuras.add(fig);
	}

	public void remover(Figura fig) {
		figuras.remove(fig);
	}

	public void desenha() {
		for(Figura fig: figuras) {
			fig.desenha();
		}
	}

	@Override
	public void mudaCordeFundo(Cor cor) {
		for(Figura fig: figuras) {
			fig.mudaCordeFundo(cor);
		}
		
	}
}
