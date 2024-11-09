package commands;

public abstract class Command {
    protected Pedido pedido;

    public Command(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract void execute();
}
