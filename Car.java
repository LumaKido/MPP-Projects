package veiculos;

/*
 * criando um veiculo carro com o seu atrbuto especifico
 * reescrevendo o clone para clonar as definicoes de um veiculo
 */

public class Car extends Vehicle {
    private int portas;

    public Car() {
    }

    public Car(Car target) {
        super(target);
        if (target != null) {
            this.portas = target.portas;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    // Getters and Setters
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Car) || !super.equals(object)) return false;
        Car car = (Car) object;
        return car.portas == portas;
    }
}

