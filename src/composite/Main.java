package composite;

class Cliente {
	void foo(Figura fig) {
		fig.desenha();
	}	
}

class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		Circulo c1 = new Circulo();
		cliente.foo(c1);
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		FiguraAgrupada grupo = new FiguraAgrupada();
		grupo.adicionar(c1);
		grupo.adicionar(t1);
		grupo.adicionar(t2);
		cliente.foo(grupo);
	}
}


