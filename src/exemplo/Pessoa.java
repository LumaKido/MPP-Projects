package exemplo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private Personalidade personalidade;
	private List<Relacionamento> relacionamentos;

	public Pessoa(String nome, Personalidade personalidade) {
		this.nome = nome;
		this.personalidade = personalidade;
		this.relacionamentos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void adicionarRelacionamento(Relacionamento relacionamento) {
		relacionamentos.add(relacionamento);
	}

	public List<Relacionamento> getRelacionamentos() {
		return relacionamentos;
	}

	@Override
	public String toString() {
		return "Pessoa\n" + "Nome: " + nome + "\nPersonalidade: " + personalidade + "\nRelacionamentos\n"
				+ relacionamentos + "\n";
	}
}
