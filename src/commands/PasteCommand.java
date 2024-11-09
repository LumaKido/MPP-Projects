package commands;

public class PasteCommand extends Command {

    public PasteCommand(Garcom garcom) {
        super(garcom);
    }

    @Override
    public boolean execute() {
        if (garcom.clipboard == null || garcom.clipboard.isEmpty()) return false;

        pedido();
        garcom.textField.insert(garcom.clipboard, garcom.textField.getCaretPosition());
        return true;
    }
}
