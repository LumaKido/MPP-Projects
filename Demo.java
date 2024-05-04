package veiculos;

/*
 * Passando as definicoes especicas para os atributos de cada veiculo
 * e comparando os veiculos
 */

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		List<Vehicle> vehicleCopy = new ArrayList<>();

		Car Car = new Car();
		Car.marca = "Toyota";
		Car.modelo = "Corolla";
		Car.ano = 2020;
		Car.setPortas(4);
		vehicles.add(Car);

		Motorcycle moto = new Motorcycle();
		moto.marca = "Harley Davidson";
		moto.modelo = "Street 750";
		moto.ano = 2019;
		moto.setTemSidecar(false);
		vehicles.add(moto);

		cloneAndCompare(vehicles, vehicleCopy);
	}

	private static void cloneAndCompare(List<Vehicle> Vehicles, List<Vehicle> vehicleCopy) {
		for (Vehicle Vehicle : Vehicles) {
			vehicleCopy.add(Vehicle.clone());
		}

		for (int i = 0; i < Vehicles.size(); i++) {
			if (Vehicles.get(i) != vehicleCopy.get(i)) {
				System.out.println(i + ": Veículos são objetos diferentes");
				if (Vehicles.get(i).equals(vehicleCopy.get(i))) {
					System.out.println(i + ": E eles são idênticos");
				} else {
					System.out.println(i + ": Mas eles não são idênticos");
				}
			} else {
				System.out.println(i + ": Objetos de Veículo são os mesmos");
			}
		}
	}
}
