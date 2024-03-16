package button;

public class WindowsFactory implements GUIFactory {
	//Um dos tipos de Factory reescrevendo o metodo paint do button
	
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
