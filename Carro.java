package mpp;

//carro herdando de automovel
public class Carro extends Automovel{
    //Atributo especifico dessa classe filha, ja que um automovel pode ser uma moto, que nao tem porta
    private int qtdPortas;

    public Carro(String marca, double preco, String placa, int qtdPortas) {
        super(marca, preco, placa);
        this.qtdPortas = qtdPortas;
    }

    // Sobrescrevendo o método abstrato = polimorfismo
    @Override
    public String getDescricao() {
        return String.format("Carro: %s \nPreco: %.2f \nPlaca: %s \nQuantidade de portas: %d", getMarca(), getPreco(), getPlaca(), qtdPortas);
    }
}
