package exemplo;

public class Relacionamento {

	private String tipo;
	private Pessoa pessoaRelacionada;

	public Relacionamento(String tipo, Pessoa pessoaRelacionada) {
		this.tipo = tipo;
		this.pessoaRelacionada = pessoaRelacionada;
	}

	public String getTipo() {
		return tipo;
	}

	public Pessoa getPessoaRelacionada() {
		return pessoaRelacionada;
	}

	@Override
	public String toString() {
		return "\nRelacionamento:\n" + "Tipo: " + tipo + "\nPessoa Relacionada: " + pessoaRelacionada.getNome() + "\n";
	}
}