public class Client {

    private static Application configureApplication(){
        Application app;
        CarFactory factory;

        String fiatCar = System.getProperty("fiat.car").toLowerCase();
        if(fiatCar.contains("palio") || fiatCar.contains("siena")){
            factory = new FiatFactory();
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.showInformation();
    }
}
