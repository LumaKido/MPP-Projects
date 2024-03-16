package button;

public class MacOSCheckbox implements Checkbox {
	//Um dos tipos de Checkbox reescrevendo o metodo paint do button
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
