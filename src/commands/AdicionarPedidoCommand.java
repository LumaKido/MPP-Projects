package commands;

public class AdicionarPedidoCommand {
    private Pedido pedido;

    public AdicionarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    public void execute() {
        // Aqui você pode incluir a lógica de "executar" o comando, 
        // que pode ser apenas salvar ou mostrar o pedido, por exemplo.
        System.out.println("Pedido adicionado: " + pedido.getDescricao());
    }
}