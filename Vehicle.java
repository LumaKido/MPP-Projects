package veiculos;
/*
 * Classe vehicle que tera a interface clonavel e os atributos base de um veiculo
 */

public abstract class Vehicle {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Vehicle() {
    }

    public Vehicle(Vehicle target) {
        if (target != null) {
            this.marca = target.marca;
            this.modelo = target.modelo;
            this.ano = target.ano;
        }
    }

    public abstract Vehicle clone();

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Vehicle)) return false;
        Vehicle vehicle2 = (Vehicle) object;
        return vehicle2.marca.equals(marca) && vehicle2.modelo.equals(modelo) && vehicle2.ano == ano;
    }
}

