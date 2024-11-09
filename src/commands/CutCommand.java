package commands;

public class CutCommand extends Command {

    public CutCommand(Garcom garcom) {
        super(garcom);
    }

    @Override
    public boolean execute() {
        if (garcom.textField.getSelectedText().isEmpty()) return false;

        pedido();
        String source = garcom.textField.getText();
        garcom.clipboard = garcom.textField.getSelectedText();
        garcom.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, garcom.textField.getSelectionStart());
        String end = source.substring(garcom.textField.getSelectionEnd());
        return start + end;
    }
}
