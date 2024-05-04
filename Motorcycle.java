package veiculos;

public class Motorcycle extends Vehicle {
    private boolean temSidecar;

    public Motorcycle() {
    }

    public Motorcycle(Motorcycle target) {
        super(target);
        if (target != null) {
            this.temSidecar = target.temSidecar;
        }
    }

    @Override
    public Vehicle clone() {
        return new Motorcycle(this);
    }

    // Getters and Setters
    public boolean isTemSidecar() {
        return temSidecar;
    }

    public void setTemSidecar(boolean temSidecar) {
        this.temSidecar = temSidecar;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Motorcycle) || !super.equals(object)) return false;
        Motorcycle motorcycle = (Motorcycle) object;
        return motorcycle.temSidecar == temSidecar;
    }
}

