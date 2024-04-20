package bicicletas;

//creacao chamando cada vehicle que tiver de acordo como que colocar o getVehicle

public class ConcreteVehicleFactory extends VehicleFactory {
	
    @Override
    public IFactory getVehicle(String vehicle) {
        switch (vehicle) {
            case "Scooter":
                return new Scooter();
            case "Bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Vehicle " + vehicle + " cannot be created");
        }
    }
}
