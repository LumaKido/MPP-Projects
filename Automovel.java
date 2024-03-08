package mpp;

public abstract class Automovel {
    //Atributos
    private String marca;
    private double preco;
    private String placa;

    //Construtores
    public Automovel(String marca, double preco, String placa) {
        this.marca = marca;
        this.preco = preco;
        this.placa = placa;
    }

    //Getters e Setters - Encapsulamento
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Método abstrato para demonstrar polimorfismo
    public abstract String getDescricao();

}
