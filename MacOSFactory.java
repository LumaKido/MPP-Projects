package button;

public class MacOSFactory implements GUIFactory {
	//Um dos tipos de Factory reescrevendo o metodo paint do button
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
