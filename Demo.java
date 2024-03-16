package button;

//Onde a aplicacao ira rodar
public class Demo {

    /**
     * A app ira escolher o produto em especifico que ela quer
     * e formara a execucao de acordo com o que foi escolhido
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
