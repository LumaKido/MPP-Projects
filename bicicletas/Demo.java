package bicicletas;

// Classe main que passara os parametros que voce deseja que mostre no console

public class Demo {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        IFactory scooter = factory.getVehicle("Scooter");
        scooter.Corrida(10);

        IFactory bike = factory.getVehicle("Bike");
        bike.Corrida(20);
    }
}

