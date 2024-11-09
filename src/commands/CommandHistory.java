package commands;

import java.util.Stack;

public class CommandHistory {
    private Stack<AdicionarPedidoCommand> history = new Stack<>();

    public void push(AdicionarPedidoCommand command) {
        history.push(command);
    }

    public AdicionarPedidoCommand pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}