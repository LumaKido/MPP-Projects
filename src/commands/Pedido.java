package commands;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<String> ingredientes;
    private static int contador = 1;
    private int numeroPedido;

    public Pedido() {
        this.ingredientes = new ArrayList<>();
        this.numeroPedido = contador++;
    }

    public void adicionarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void resetarPedido() {
        ingredientes.clear();
    }

    public String getDescricao() {
        return "Pedido #" + numeroPedido + ": " + String.join(", ", ingredientes);
    }
}