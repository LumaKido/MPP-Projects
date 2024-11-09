package commands;

public class CopyCommand extends Command {

    public CopyCommand(Garcom garcom) {
        super(garcom);
    }

    @Override
    public boolean execute() {
        garcom.clipboard = garcom.textField.getSelectedText();
        return false;
    }
}
