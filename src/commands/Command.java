package commands;

public abstract class Command {
    public Garcom garcom;
    private String backup;

    Command(Garcom garcom) {
        this.garcom = garcom;
    }

    void pedido() {
        backup = garcom.textField.getText();
    }

    public void undo() {
        garcom.textField.setText(backup);
    }

    public abstract boolean execute();
}
