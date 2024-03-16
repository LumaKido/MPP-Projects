package button;

//Chamada dos produtos
public class Application {
    private Button button;
    private Checkbox checkbox;

    //Ambos fazem a criacao dos produtos nas suas respectivas formas diferentes
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    //Chamando a funcao de cada um
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
