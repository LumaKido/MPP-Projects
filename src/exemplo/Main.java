package exemplo;

public class Main {
	public static void main(String[] args) {
		// Criando personalidades
		Personalidade persona1 = new Personalidade("Extrovertida e brincalhona");
		Personalidade persona2 = new Personalidade("Antissocial e fofinho");
		Personalidade persona3 = new Personalidade("Introvertida");

		// Criando pessoas
		Pessoa pessoa1 = new Pessoa("Bruna", persona1);
		Pessoa pessoa2 = new Pessoa("Yuri", persona2);
		Pessoa pessoa3 = new Pessoa("Luma", persona3);

		// Criar relacionamentos
		Relacionamento r1 = new Relacionamento("Melhor amiga", pessoa3);
		Relacionamento r2 = new Relacionamento("Amigo", pessoa1);
		Relacionamento r3 = new Relacionamento("Melhor amiga", pessoa1);

		// Adicionar relacionamentos
		pessoa1.adicionarRelacionamento(r1);
		pessoa2.adicionarRelacionamento(r2);
		pessoa3.adicionarRelacionamento(r3);

		// Exibir informações
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
	}
}
