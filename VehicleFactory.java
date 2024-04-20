package bicicletas;

//classe abstrata creator que chama o IFactory

public abstract class VehicleFactory {
	
    public abstract IFactory getVehicle(String vehicle);
}